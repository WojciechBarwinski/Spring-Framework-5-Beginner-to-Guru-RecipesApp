package wojciech.barwinski.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import wojciech.barwinski.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
