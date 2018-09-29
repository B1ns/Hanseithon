
package com.example.trends;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _0 {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
