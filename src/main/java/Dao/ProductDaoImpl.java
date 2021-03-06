package Dao;

import Api.ProductDao;
import Enity.Parser.ProductParser;
import Enity.Product;
import Utils.FileUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao
{
    private final String fileName;
    private final String productType;

    public ProductDaoImpl(String fileName, String productType)
    {
        this.fileName = fileName;
        this.productType = productType;

        try
        {
            FileUtils.createNewFile(fileName);
        }

        catch(IOException e)
        {
            System.out.println("Error with file");
            System.exit(-1);
        }
    }

    @Override
    public void saveProduct(Product product) throws IOException
    {
        List<Product> products = this.getAllProducts();
        products.add(product);
        this.saveProducts(products);
    }

    @Override
   public void saveProducts(List<Product> products) throws FileNotFoundException
    {
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName, true));

        for(Product product: products)
        {
            printWriter.println(product.toString());
        }

        printWriter.close();
    }

    @Override
    public void removeProductById(int id) throws IOException
    {
        List<Product> products = this.getAllProducts();

        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getId() == id)
            {
                products.remove(i);
                break;
            }
        }

        this.saveProducts(products);
    }

    @Override
    public void removeProductByName(String productName) throws IOException
    {
        List<Product> products = this.getAllProducts();

        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getProductName().equals(productName))
            {
                products.remove(i);
                break;
            }
        }

        this.saveProducts(products);
    }

    @Override
    public List<Product> getAllProducts() throws IOException
    {
        List<Product> products = new ArrayList<Product>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String readLine = reader.readLine();
        while(readLine != null)
        {
            Product product = ProductParser.stringToProduct(readLine, productType);

            if(product != null)
            {
                products.add(product);
            }

            readLine = reader.readLine();
        }

        reader.close();

        return products;
    }

    @Override
    public Product getProductById(int id) throws IOException
    {
        List<Product> products = this.getAllProducts();

        for(Product product: products)
        {
            if(product.getId() == id)
            {
                return product;
            }
        }

        return null;
    }

    @Override
    public Product getProductByName(String productName) throws IOException
    {
        List<Product> products = this.getAllProducts();

        for(Product product: products)
        {
            if(product.getProductName().equals(productName))
            {
                return product;
            }
        }

        return null;
    }
}
