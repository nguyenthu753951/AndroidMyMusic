package com.example.onlinemymusic.Model;

public class Upload {
    String name;
    String Url;
    String songsCategory;

    public Upload(String name, String url, String songsCategory) {
        this.name = name;
        Url = url;
        this.songsCategory = songsCategory;
    }

    public Upload() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getSongsCategory() {
        return songsCategory;
    }

    public void setSongsCategory(String songsCategory) {
        this.songsCategory = songsCategory;
    }
}
