package data;

import org.json.JSONObject;

public class Channel implements JSONPopulator {

    private Item item;
    private Unit unit;
    public Item getItem() {
        return item;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public void populate(JSONObject data) {
        unit = new Unit();
        unit.populate(data.optJSONObject("units"));
        item = new Item();
        item.populate(data.optJSONObject("item"));
    }
}
