package com.direct.main.weatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/19 0019.
 */

public class County extends DataSupport {
    private int id;//实体的id
    private String countyName;//县的名称
    private String weatherId;//city天气id
    private int cityId;//城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
