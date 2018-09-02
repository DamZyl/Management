package Service;

import Api.ProductDao;
import Api.ProductService;
import Dao.ProductDaoImpl;
import Enity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService
{
    private ProductDao productDao = new ProductDaoImpl("products", "Product");
    private static ProductServiceImpl instance = null;

    public static ProductServiceImpl getInstance()
    {
        if(instance == null)
        {
            instance = new ProductServiceImpl();
        }

        return instance;
    }

    private ProductServiceImpl()
    {

    }

    @Override
    public List<Product> getAllProducts() throws IOException
    {
        return productDao.getAllProducts();
    }

    @Override
    public int getProductsCount() throws IOException
    {
        return this.getAllProducts().size();
    }

    @Override
    public Product getProductByProductName(String productName) throws IOException
    {
        return productDao.getProductByName(productName);
    }

    @Override
    public boolean isProductExists(String productName)
    {
        Product product = null;

        try
        {
            product = productDao.getProductByName(productName);
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        if(product == null)
        {
            return false;
        }

        return true;
    }

    @Override
    public boolean isProductExists(int id)
    {
        Product product = null;

        try
        {
            product = productDao.getProductById(id);
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        if(product == null)
        {
            return false;
        }

        return true;
    }

    @Override
    public boolean isProductInStore(String productName)
    {
        try
        {
            for(Product product: this.getAllProducts())
            {
                if(this.isProductExists(productName) && this.getProductsCount() > 0)
                {
                    return true;
                }
            }
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        return false;
    }
}
