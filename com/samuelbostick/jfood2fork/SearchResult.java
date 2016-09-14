package com.samuelbostick.jfood2fork;

import com.owlike.genson.annotation.JsonProperty;

public class SearchResult {
    private int _count;
    private Recipe[] _recipes;

    public SearchResult(
            @JsonProperty("count") int count,
            @JsonProperty("recipes") Recipe[] recipes
    ){
        _count = count;
        _recipes = recipes;
    }

    @JsonProperty("count")
    public int getCount(){
        return _count;
    }

    @JsonProperty("recipes")
    public Recipe[] getRecipes(){
        return _recipes;
    }
}
