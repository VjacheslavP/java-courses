package slavik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import slavik.domain.Category;
import slavik.domain.Product;
import slavik.services.CategoryService;
import slavik.services.ProductService;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
	@Autowired
	private ProductService productService;

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
