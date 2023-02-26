package com.foodRecipe.receiptBook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    String label;
    String imageUrl;
    int servings;
    int totalTime;
    double calories;
    double caloriesPerServings;
    List<Ingredients> ingredients;
    String source;
    String url;

}
