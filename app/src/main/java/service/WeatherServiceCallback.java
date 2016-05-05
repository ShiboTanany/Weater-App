package service;

import data.Channel;

/**
 * Created by khalid on 4/23/16.
 */
public interface WeatherServiceCallback  {
    void serviceSuccess(Channel channel);
    void serviceFilure(Exception exception);
}
