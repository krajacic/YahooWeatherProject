package cawabanga.com.yahooweatherproject.data;

import org.json.JSONObject;

/**
 * Created by croatan on 26.11.2015..
 */
public class Units implements JSONPopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
