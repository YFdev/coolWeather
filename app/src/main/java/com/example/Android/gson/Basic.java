package com.example.Android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YF_lala on 2018/1/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
