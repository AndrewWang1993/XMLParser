package com.example.provinceandcityforcn.model;

/**
 * ³ÇÊÐ
 * @author zzp
 *
 */
public class Pic {
    String PicUrl;
    String Name;
    String Id;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "City{" +
                "PicUrl='" + PicUrl + '\'' +
                ", Name='" + Name + '\'' +
                ", Id='" + Id + '\'' +
                '}';
    }
}
