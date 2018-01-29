package com.example.Android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by YF_lala on 2018/1/29.
 */

public class Province extends DataSupport {
    private String provinceName;
    private int provinceCode;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
