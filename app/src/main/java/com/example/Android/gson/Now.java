package com.example.Android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YF_lala on 2018/1/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
