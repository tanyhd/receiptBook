package com.foodRecipe.receiptBook.model.JwtAuthentication;

import com.foodRecipe.receiptBook.model.InventoryLineItem;
import com.foodRecipe.receiptBook.model.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    private String name;
    private String email;
    private List<InventoryLineItem> lineItem;
    private List<Recipe> recipesList;
    private String token;
}
