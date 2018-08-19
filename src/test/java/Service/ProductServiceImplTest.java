package Service;

import Enity.Cloth;
import Enity.Product;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImplTest
{
    @Test
    public void testGetAllProductsEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100));
        products.add(new Product(2, "Figi damskie", 25.50, 0.12, "bialy", 50));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();

        //expected
        Assert.assertEquals(products, productsFromTestClass);
    }

    @Test
    public void testGetAllProductsNotEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100));
        products.add(new Product(2, "Figi damskie", 25.50, 0.12, "bialy", 50));

        //then
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> productsFromTestClass = productService.getAllProducts();

        //expected
        Assert.assertNotEquals(products, productsFromTestClass);
    }

    @Test
    public void testGetProductCountEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100));
        products.add(new Product(2, "Figi damskie", 25.50, 0.12, "bialy", 50));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final int result = productService.getProductsCount();

        //expected
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetProductCountNotEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final int result = productService.getProductsCount();

        //expected
        Assert.assertNotEquals(2, result);
    }

    @Test
    public void testGetProductByProductNameEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        Product product = new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100);
        products.add(product);

        //then
        final String productName = product.getProductName();
        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product productTest = productService.getProductByProductName(productName);

        //expected
        Assert.assertEquals(product, productTest);
    }

    @Test
    public void testGetProductByProductNameNotEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        Product product = new Product(1, "Bokserki meskie", 15.50, 0.15, "czarny", 100);
        products.add(product);

        //then
        final String productName = "Figi damskie";
        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product productTest = productService.getProductByProductName(productName);

        //expected
        Assert.assertNotEquals(product, productTest);
    }

    @Test
    public void testIsProductInStoreEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "T-Shirt", 50, 0.25, "czerwony", 25, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductInStrone = productService.isProductInStore("T-Shirt");

        //expected
        Assert.assertTrue(isProductInStrone);
    }

    @Test
    public void testIsProductInStoreNotEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "T-Shirt", 50, 0.25, "czerwony", 0, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductInStrone = productService.isProductInStore("T-Shirt");

        //expected
        Assert.assertFalse(isProductInStrone);
    }

    @Test
    public void testIsProductExistNameEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "T-Shirt Slim", 50, 0.25, "czerwony", 25, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExists = productService.isProductExists("T-Shirt Slim");

        //expected
        Assert.assertTrue(isProductExists);
    }

    @Test
    public void testIsProductExistIdEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "T-Shirt", 50, 0.25, "czerwony", 25, "M", "bawelna"));
        products.add(new Cloth(2, "T-Shirt", 50, 0.25, "czerwony", 25, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExists = productService.isProductExists(1);

        //expected
        Assert.assertTrue(isProductExists);
    }

    @Test
    public void testIsProductExistIdNotEqual()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "Sweter", 75, 0.35, "bialy", 50, "S", "bawelna"));
        products.add(new Cloth(2, "T-Shirt", 50, 0.25, "czerwony", 25, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExists = productService.isProductExists(3);

        //expected
        Assert.assertFalse(isProductExists);
    }
}
