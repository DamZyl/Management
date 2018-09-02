package Api;

import Enity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService
{
    List<Product> getAllProducts() throws IOException;
    int getProductsCount() throws IOException;
    Product getProductByProductName(String productName) throws IOException;
    boolean isProductInStore(String productName);
    boolean isProductExists(String productName);
    boolean isProductExists(int id);
}
