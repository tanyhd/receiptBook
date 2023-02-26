package com.foodRecipe.receiptBook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Ingredients {

    String text;
    float quantity;
    String measure;
    String foodId;
    String imageUrl;
    String food;
}
