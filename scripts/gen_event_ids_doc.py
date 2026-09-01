import re
from collections import OrderedDict

SRC = "/home/user/integrated-lucky-blocks/src/main/java/blueduck/ilb/registry/EventAdditions.java"
OUT = "/home/user/integrated-lucky-blocks/docs/EVENT_IDS.md"

CATEGORY_TITLES = OrderedDict([
    ("default", "Default (vanilla Minecraft)"),
    ("alexcaves", "Alex's Caves"),
    ("alexmobs", "Alex's Mobs"),
    ("outerend", "Outer End"),
    ("jellyfishing", "Jellyfishing"),
    ("dustrialdecor", "Dustrial Decor"),
    ("blightedbeasts", "Blighted Beasts"),
    ("artifacts", "Artifacts"),
    ("vturrets", "Vounier Turrets"),
    ("compoundv", "Compound V"),
    ("jollyboxes", "Jolly Boxes"),
    ("cavernsandchasms", "Caverns & Chasms"),
    ("create", "Create"),
    ("rottencreatures", "Rotten Creatures"),
    ("dimdoors", "Dimensional Doors"),
    ("invincible", "Invincible"),
])

call_re = re.compile(
    r'EventList\.addEvent\(new LuckyEvent\("(\w+)",\s*"([a-z0-9_]+)",\s*(.*)\),\s*(\d+)\);\s*$'
)

def main():
    with open(SRC) as f:
        lines = f.readlines()

    rows_by_category = {cat: [] for cat in CATEGORY_TITLES}

    for line in lines:
        if line.strip().startswith('//'):
            continue
        m = call_re.search(line)
        if not m:
            continue
        category, event_id, actions_raw, weight = m.groups()
        effect = actions_raw.strip()
        # collapse excess whitespace for a tidy table cell, escape pipes
        effect = re.sub(r'\s+', ' ', effect).replace('|', '\\|')
        if category not in rows_by_category:
            rows_by_category[category] = []
        rows_by_category[category].append((event_id, weight, effect))

    lines_out = []
    lines_out.append("# Lucky Event IDs\n\n")
    lines_out.append(
        "Every outcome the mod can roll has a stable `id` and belongs to a `category`. "
        "Use the `id` values below in `safety.disabledEvents` (in the mod's config file) "
        "to turn off individual outcomes, or use the matching `events.enableXEvents` toggle "
        "to turn off an entire category at once.\n\n"
        "This file is generated from `EventAdditions.java` - regenerate it with "
        "`scripts/gen_event_ids_doc.py` whenever events are added, removed, or reordered.\n\n"
    )

    total = 0
    for category, title in CATEGORY_TITLES.items():
        rows = rows_by_category.get(category, [])
        if not rows:
            continue
        total += len(rows)
        lines_out.append(f"## {title} (`category: {category}`)\n\n")
        lines_out.append("| id | weight | effect |\n")
        lines_out.append("|---|---|---|\n")
        for event_id, weight, effect in rows:
            lines_out.append(f"| `{event_id}` | {weight} | `{effect}` |\n")
        lines_out.append("\n")

    lines_out.insert(3, f"**{total} events documented.**\n\n")

    import os
    os.makedirs(os.path.dirname(OUT), exist_ok=True)
    with open(OUT, 'w') as f:
        f.writelines(lines_out)

    print(f"Wrote {total} event rows to {OUT}")

if __name__ == "__main__":
    main()
