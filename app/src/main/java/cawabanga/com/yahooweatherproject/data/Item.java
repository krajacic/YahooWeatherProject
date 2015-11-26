package cawabanga.com.yahooweatherproject.data;

import org.json.JSONObject;

/**
 * Created by croatan on 26.11.2015..
 */
public class Item implements JSONPopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
