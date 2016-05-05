package service;

import android.net.Uri;
import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import data.Channel;

/**
 * Created by khalid on 4/23/16.
 */
public class YahooWeatherService {
    private WeatherServiceCallback callBack;
    private String location;
    private Exception error;

    public YahooWeatherService(WeatherServiceCallback callback) {
        this.callBack = callback;
    }

    public String getLocation() {
        return location;
    }

    public void refreshWeather(String location) {
        this.location=location;
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {
                String YQL = String.format("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"%s\")", strings[0]);
                String endpoint = String.format("https://query.yahooapis.com/v1/public/yql?q=%s&format=json", Uri.encode(YQL));
                try {
                    URL url = new URL(endpoint);
                    URLConnection connection = url.openConnection();
                    InputStream inputStream = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder result = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }
                    return result.toString();
                } catch (Exception e) {
                    error = e;
                }


                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                if (s == null && error != null) {
                    callBack.serviceFilure(error);
                    return;
                }
                try {
                    JSONObject data = new JSONObject(s);
                    JSONObject queryResult = data.optJSONObject("query");
                    int count = queryResult.getInt("count");
                    if (count == 0) {
                        callBack.serviceFilure(new locationWeatherException("No weather information found"));
                        return;
                    }
                    Channel channel = new Channel();
                    channel.populate(queryResult.optJSONObject("results").optJSONObject("channel"));
                    callBack.serviceSuccess(channel);
                } catch (Exception e) {
                    callBack.serviceFilure(e);
                }
            }
        }.execute(location);
    }

    public class locationWeatherException extends Exception {
        public locationWeatherException(String detailMessage) {
            super(detailMessage);
        }
    }
}
