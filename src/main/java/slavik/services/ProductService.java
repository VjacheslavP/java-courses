package slavik.services;

import org.springframework.stereotype.Service;
import slavik.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
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

    public Product[] getProductsByCategory(int cid) {
        List<Product> result = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getCategory() == cid)
                result.add(product);
        }
        Product[] result_array = new Product[result.size()];
        result.toArray(result_array);
        return products;
    }
}
