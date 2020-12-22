package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductService {
    private static Map<Integer, Product> products = new TreeMap<>();
    static {
        products.put(1, new Product(1, "xuc xich", "12/03/2021", 4));
        products.put(2, new Product(2, "sua tuoi", "12/03/2021", 4));
        products.put(3, new Product(3, "my goi", "12/03/2021", 4));
        products.put(4, new Product(4, "banh my", "12/03/2021", 4));
        products.put(5, new Product(5, "xi dau", "12/03/2021", 4));
        products.put(6, new Product(6, "tuong ot", "12/03/2021", 4));
    }

    public static List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
    public static void save(Product product) {
        products.put(product.getId(), product);
    }
    public static Product findById(int id) {
        return products.get(id);
    }
    public static void remove(int id) {
        products.remove(id);
    }
    public static Product findByName(String name) {
        List<Product> list = findAll();
        Product product = null;
        for(Product p : list) {
            if(name.equals(p.getName())) {
                product = p;
            }
        }
        return product;
    }
}
