package com.foodRecipe.recipeBook.controller;

import com.foodRecipe.recipeBook.model.Recipe;
import com.foodRecipe.recipeBook.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.foodRecipe.recipeBook.util.Constant.GET_SAMPLE_RECIPES_RESPONSE;

@RestController
@RequiredArgsConstructor
public class RecipesController {
    private final RecipeService recipeService;

    @GetMapping(path="/api/recipes/{food}")
    @Operation(
            description = "Search for food recipes",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Recipe found",
                            content = @Content(
                                    mediaType = "application/json",
                                    examples = { @ExampleObject(value = GET_SAMPLE_RECIPES_RESPONSE) }))
            })
    public CompletableFuture<ResponseEntity<List<Recipe>>> getRecipes(@PathVariable String food) {
        return recipeService.getRecipe(food).thenApply(ResponseEntity::ok);
    }


    @GetMapping(path="/api/recipes/meal/{mealRequirement}")
    public CompletableFuture<ResponseEntity<List<Recipe>>> getRecipesBaseOnRequirement(@PathVariable String mealRequirement) {
        return recipeService.getRecipesBaseOnRequirement(mealRequirement).thenApply(ResponseEntity::ok);
    }
}
