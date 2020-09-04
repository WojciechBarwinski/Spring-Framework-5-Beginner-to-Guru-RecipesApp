package wojciech.barwinski.spring5recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wojciech.barwinski.spring5recipeapp.domain.Category;
import wojciech.barwinski.spring5recipeapp.domain.UnitOfMeasure;
import wojciech.barwinski.spring5recipeapp.repositories.CategoryRepository;
import wojciech.barwinski.spring5recipeapp.repositories.UnitOfMeasureRepository;
import wojciech.barwinski.spring5recipeapp.services.RecipeService;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
