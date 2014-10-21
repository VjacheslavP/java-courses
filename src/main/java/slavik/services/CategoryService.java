package slavik.services;

import org.springframework.stereotype.Service;
import slavik.domain.Category;
import slavik.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private Category[] categories;

    public CategoryService() {
        Category[] categories = new Category[5];
        categories[0] = new Category("auto", 0);
        categories[1] = new Category("phones", 1);
        categories[2] = new Category("books", 2);
        categories[3] = new Category("computers", 3);
        categories[4] = new Category("watch", 4);
        this.categories = categories;
    }

    public Category getCategoryById(int id) {
        return id > 0 && id < categories.length ? categories[0] : null;
    }

    private Product[] products = {
            new Product("bmw", 0, 0),
            new Product("java for dummies", 2, 1),
            new Product("samsung smartwatch", 4, 2),
            new Product("audi", 0, 3),
            new Product("toyota", 0, 4),
            new Product("nokia", 1, 5),
            new Product("siemens", 1, 6),
            new Product("opel", 0, 7),
            new Product("Garry Potter", 0, 8),
    };

    public Category[] getAllCategories() {
        return this.categories;
    }
}
