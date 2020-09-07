package wojciech.barwinski.spring5recipeapp.services;

import wojciech.barwinski.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
