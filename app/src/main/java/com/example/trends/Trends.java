
package com.example.trends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trends {

    @SerializedName("t")
    @Expose
    private String t;
    @SerializedName("0")
    @Expose
    private com.example.trends._0 _0;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public com.example.trends._0 get0() {
        return _0;
    }

    public void set0(com.example.trends._0 _0) {
        this._0 = _0;
    }

}
