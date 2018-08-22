package Api;

import Enity.Product;
import java.util.List;

public interface ProductDao
{
    void saveProduct(Product product);
    void saveProducts(List<Product> products);
    void removeProductById(int id);
    void removeProductByName(String productName);
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product getProductByName(String productName);
}
