package com.direct.main.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/19 0019.
 */

public class Basic {
    @SerializedName("city")
    public String cityNmae;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
