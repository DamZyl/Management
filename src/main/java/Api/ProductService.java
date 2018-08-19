package Api;

import Enity.Product;
import java.util.List;

public interface ProductService
{
    List<Product> getAllProducts();
    int getProductsCount();
    Product getProductByProductName(String productName);
    boolean isProductInStore(String productName);
    boolean isProductExists(String productName);
    boolean isProductExists(int id);
}
