package slavik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import slavik.domain.Category;
import slavik.domain.Product;
import slavik.services.CategoryService;
import slavik.services.ProductService;
import slavik.session.UserInterface;

@Controller
@Scope("session")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	@Autowired
	private UserInterface currentUser;

    @RequestMapping("/category/{id}")
    public String getCategoryInfo(Model model, @PathVariable int id) {
        Category category = categoryService.getCategoryById(id);
        if (category == null) {
            model.addAttribute("type", "category");
            model.addAttribute("field", "id");
            model.addAttribute("value", id);
            return "unknown";
        }
        model.addAttribute("category", category);
	    model.addAttribute("user", currentUser.getName());
        return "category";
    }

    @RequestMapping("/products/{id}")
    public String getCategoryProducts(Model model, @PathVariable int id) {
        Product[] products = productService.getProductsByCategory(id);
        if (products == null) {
            model.addAttribute("type", "category_products");
            model.addAttribute("field", "id");
            model.addAttribute("value", id);
            return "unknown";
        }
        model.addAttribute("products", products);
        return "products";
    }
}
