package Dao;

import Api.ProductDao;
import Enity.Product;
import java.util.List;

public class ProductDaoImpl implements ProductDao
{
    private final String fileName;

    public ProductDaoImpl(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void saveProduct(Product product)
    {
        List<Product> products = this.getAllProducts();
        products.add(product);
        this.saveProducts(products);
    }

    @Override
   public void saveProducts(List<Product> products)
    {

    }

    @Override
    public void removeProductById(int id)
    {

    }

    @Override
    public void removeProductByName(String productName)
    {


    }

    @Override
    public List<Product> getAllProducts()
    {
        return null;
    }

    @Override
    public Product getProductById(int id)
    {
        return null;
    }

    @Override
    public Product getProductByName(String productName)
    {
        return null;
    }
}
