package com.direct.main.weatherdemo.gson;

/**
 * Created by Administrator on 2017/9/19 0019.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
