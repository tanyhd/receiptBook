package com.foodRecipe.receiptBook.external.edamam;


import com.foodRecipe.receiptBook.model.RecipeResponseOverview;
import feign.Param;
import feign.RequestLine;


public interface EdamamApi {

    @RequestLine("GET /api/recipes/v2?type=public&q={food}&app_id={appId}&app_key={appKey}")
    RecipeResponseOverview getRecipeOverview(
            @Param("food") String food,
            @Param("appId") String appId,
            @Param("appKey") String appKey
    );

}
