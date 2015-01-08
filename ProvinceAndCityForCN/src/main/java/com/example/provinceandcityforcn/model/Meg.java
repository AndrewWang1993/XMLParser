package com.example.provinceandcityforcn.model;

/**
 * Created by wangxm-wr on 2015/1/8 in Vanke.
 */
public class Meg {
    String Type;
    String VideoUrl;
    String WebUrl;
    String Descri;

    @Override
    public String toString() {
        return "Meg{" +
                "Type='" + Type + '\'' +
                ", VideoUrl='" + VideoUrl + '\'' +
                ", WebUrl='" + WebUrl + '\'' +
                ", Descri='" + Descri + '\'' +
                '}';
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getVideoUrl() {
        return VideoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        VideoUrl = videoUrl;
    }

    public String getWebUrl() {
        return WebUrl;
    }

    public void setWebUrl(String webUrl) {
        WebUrl = webUrl;
    }

    public String getDescri() {
        return Descri;
    }

    public void setDescri(String descri) {
        Descri = descri;
    }
}
