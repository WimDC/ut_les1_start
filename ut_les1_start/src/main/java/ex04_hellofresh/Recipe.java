package ex04_hellofresh;

import java.util.ArrayList;
import java.util.Arrays;

public class Recipe {
    private String dishName;
    private Integer amountForRecipe;
    private ArrayList<Ingredient> ingredients;

    public Recipe(String dishName, Integer amountForRecipe) {
        this.dishName = dishName;
        this.amountForRecipe = amountForRecipe;
    }
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getAmountForRecipe() {
        return amountForRecipe;
    }

    public void setAmountForRecipe(Integer amountForRecipe) {
        this.amountForRecipe = amountForRecipe;
    }
}
