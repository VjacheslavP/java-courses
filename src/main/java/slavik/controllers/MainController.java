package slavik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import slavik.domain.Category;
import slavik.services.CategoryService;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/")
    public String getMainPage(Model model) {
        Category[] categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "main";
    }
}
