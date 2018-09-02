package Service;

import Enity.Cloth;
import Enity.Product;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImplTest
{/*
    @Test
    public void testGetAllProductsPositive()
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
    public void testGetAllProductsNegative()
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
    public void testGetProductCountPositive()
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
    public void testGetProductCountNegative()
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
    public void testGetProductByProductNamePositive()
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
    public void testGetProductByProductNameNegative()
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
    public void testIsProductInStorePositive()
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
    public void testIsProductInStoreNegative()
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
    public void testIsProductExistNamePositive()
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
    public void testIsProductExistNameNegative()
    {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1, "Sweter", 75, 0.35, "bialy", 50, "S", "bawelna"));
        products.add(new Cloth(2, "T-Shirt", 50, 0.25, "czerwony", 25, "M", "bawelna"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExists = productService.isProductExists("Bluza");

        //expected
        Assert.assertFalse(isProductExists);
    }

    @Test
    public void testIsProductExistIdPositive()
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
    public void testIsProductExistIdNegative()
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
    }*/
}
