package slavik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import slavik.services.ProductService;

/**
 * Created by v.petrushkin on 13.10.2014.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/single/{id}")
    public String getProductInfo(Model model, int id) {

        return "product";
    }

}
