package com.samuelbostick.jfood2forktest;

import com.samuelbostick.jfood2fork.Food2Fork;
import com.samuelbostick.jfood2fork.Recipe;
import com.samuelbostick.jfood2fork.SearchResult;

public class Food2ForkTest {
    public static void main(String[] args){
        Food2Fork api = new Food2Fork("84b6cdb6958b8ccf3a5115cc47eddc63");
        try{
            Recipe recipe = api.getRecipe(29159);
            SearchResult result = api.search("Ham and Cheese", 's', 2);
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
