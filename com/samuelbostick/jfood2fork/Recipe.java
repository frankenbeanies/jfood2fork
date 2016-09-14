package com.samuelbostick.jfood2fork;

import com.owlike.genson.annotation.JsonProperty;

public class Recipe {
    private String _imageUrl;
    private String _sourceUrl;
    private String _f2fUrl;
    private String _title;
    private String _publisher;
    private String _publisherUrl;
    private double _socialRank;
    private int _page;
    private String[] _ingredients;

    public Recipe(
            @JsonProperty("image_url") String imageUrl,
            @JsonProperty("source_url") String sourceUrl,
            @JsonProperty("f2f_url") String f2fUrl,
            @JsonProperty("title") String title,
            @JsonProperty("publisher") String publisher,
            @JsonProperty("publisher_url") String publisherUrl,
            @JsonProperty("social_rank") double socialRank,
            @JsonProperty("page") int page,
            @JsonProperty("ingredients") String[] ingredients
    ){
        _imageUrl = imageUrl;
        _sourceUrl = sourceUrl;
        _f2fUrl = f2fUrl;
        _title = title;
        _publisher = publisher;
        _publisherUrl = publisherUrl;
        _socialRank = socialRank;
        _page = page;
        _ingredients = ingredients;
    }

    @JsonProperty("image_url")
    public String getImageUrl(){
        return _imageUrl;
    }

    @JsonProperty("source_url")
    public String getSourceUrl(){
        return _sourceUrl;
    }

    @JsonProperty("f2f_url")
    public String getF2fUrl(){
        return _f2fUrl;
    }

    @JsonProperty("title")
    public String getTitle(){
        return _title;
    }

    @JsonProperty("publisher")
    public String getPublisher(){
        return _publisher;
    }

    @JsonProperty("publisher_url")
    public String getPublisherUrl(){
        return _publisherUrl;
    }

    @JsonProperty("social_rank")
    public double getSocialRank(){
        return _socialRank;
    }

    @JsonProperty("page")
    public int getPage(){
        return _page;
    }

    @JsonProperty("ingredients")
    public String[] getIngredients(){
        return _ingredients;
    }
}