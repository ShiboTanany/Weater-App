package data;

import org.json.JSONObject;

/**
 * Created by khalid on 4/23/16.
 */
public class Condition implements JSONPopulator {

    private int code;
    private int temperature;
    private String description;
    private String date;

    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }


    @Override
    public void populate(JSONObject data) {
        code = data.optInt("code");
        temperature = data.optInt("temp");
        description = data.optString("text");
        date = data.optString("date");
    }
}
