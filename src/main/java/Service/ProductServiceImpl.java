package Service;

import Api.ProductService;
import Enity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService
{
    private List<Product> products;

    public ProductServiceImpl()
    {
        this.products = new ArrayList<Product>();
    }

    public ProductServiceImpl(List<Product> products)
    {
        this.products = products;
    }

    @Override
    public List<Product> getAllProducts()
    {
        return products;
    }

    @Override
    public int getProductsCount()
    {
        return products.size();
    }

    @Override
    public Product getProductByProductName(String productName)
    {
        for(Product product: products)
        {
            if(product.getProductName().equals(productName))
            {
                return product;
            }
        }

        return null;
    }

    @Override
    public boolean isProductInStore(String productName)
    {
        for(Product product: products)
        {
            if(this.isProductExists(productName) && product.getProductCount() > 0)
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isProductExists(String productName)
    {
        for(Product product: products)
        {
            if(product.getProductName().equals(productName))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isProductExists(int id)
    {
        for(Product product: products)
        {
            if(product.getId() == id)
            {
                return true;
            }
        }

        return false;
    }
}
