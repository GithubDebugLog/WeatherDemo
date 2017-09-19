package com.direct.main.weatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/19 0019.
 */

public class City extends DataSupport {
    private int id;//city实体的id
    private String cityName;//城市的名称
    private int cityCode;//城市的彪马
    private int provinceId;//省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
