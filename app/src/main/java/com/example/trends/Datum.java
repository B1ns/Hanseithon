
package com.example.trends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("keyword")
    @Expose
    private String keyword;
    @SerializedName("change")
    @Expose
    private String change;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("tvalue")
    @Expose
    private Double tvalue;
    @SerializedName("cvalue")
    @Expose
    private Integer cvalue;
    @SerializedName("ratio")
    @Expose
    private String ratio;
    @SerializedName("delta")
    @Expose
    private Integer delta;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getTvalue() {
        return tvalue;
    }

    public void setTvalue(Double tvalue) {
        this.tvalue = tvalue;
    }

    public Integer getCvalue() {
        return cvalue;
    }

    public void setCvalue(Integer cvalue) {
        this.cvalue = cvalue;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public Integer getDelta() {
        return delta;
    }

    public void setDelta(Integer delta) {
        this.delta = delta;
    }

}
