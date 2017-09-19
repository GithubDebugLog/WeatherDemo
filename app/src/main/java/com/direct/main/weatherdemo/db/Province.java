package com.direct.main.weatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
//DataSupport对数据库操作
public class Province extends DataSupport {
    private int id;//实体的id
    private String provinceName;//省名称
    private int provinceCode;//省编码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
