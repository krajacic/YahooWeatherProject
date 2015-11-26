package cawabanga.com.yahooweatherproject.service;

import cawabanga.com.yahooweatherproject.data.Channel;

/**
 * Created by croatan on 26.11.2015..
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
