package com.example.khalid.lastapp;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.khalid.lastapp.R;

import data.Channel;
import data.Item;
import service.WeatherServiceCallback;
import service.YahooWeatherService;

/**
 * Created by khalid on 4/23/16.
 */
public class MainActivity extends AppCompatActivity implements WeatherServiceCallback {



    private ImageView weatherIconImageView;
    private TextView temperatureTextView;
    private TextView conditionTextView;
    private TextView locationTextView;
    private YahooWeatherService service;
    private ProgressDialog dialog;
    private TextView dateTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);

        weatherIconImageView = (ImageView) findViewById(R.id.weatherIconImageView);
        temperatureTextView = (TextView) findViewById(R.id.temperatureTextView);
        conditionTextView = (TextView) findViewById(R.id.conditionTextView);
        locationTextView = (TextView) findViewById(R.id.locationTextView);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        service = new YahooWeatherService(this);
        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...please wait");
        dialog.show();

        service.refreshWeather("Austin , TX");
    }


    @Override
    public void serviceSuccess(Channel channel) {
        dialog.hide();

        Item item = channel.getItem();
        int resourceId = getResources().getIdentifier("drawable/icon_" + item.getCondition().getCode(), null, getPackageName());
        @SuppressWarnings("deprecation")
        Drawable weatherIconDrawable = getResources().getDrawable(resourceId);
        weatherIconImageView.setImageDrawable(weatherIconDrawable);
        locationTextView.setText(service.getLocation());
        temperatureTextView.setText(item.getCondition().getTemperature() + "/" + channel.getUnit().getTemperature());
        conditionTextView.setText(item.getCondition().getDescription());
        dateTextView.setText(item.getCondition().getDate());
//        humidityTextView.setText(item.getAtmosphere().getHumidity());
    }

    @Override
    public void serviceFilure(Exception exception) {
        dialog.hide();
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();
    }
}
