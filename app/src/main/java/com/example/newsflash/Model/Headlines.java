package com.example.newsflash.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Headlines {

    @SerializedName("articles")
    @Expose
    private List<Articles> articles;


    public List<Articles> getArticles() {
        return articles;
    }

}
