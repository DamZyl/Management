package Enity.Parser;

import Enity.Boots;
import Enity.Cloth;
import Enity.Product;

public class ProductParser
{
    public static Product stringToProduct(String productStr, String productType)
    {
        if(productType.equals("Product"))
        {
            return convertToProduct(productStr);
        }

        else if(productType.equals("Cloth"))
        {
            return convertToCloth(productStr);
        }

        else if(productType.equals("Boots"))
        {
            return convertToBoots(productStr);
        }

        return null;
    }

    public static Boots convertToBoots(String productStr)
    {
        String[] productInfo = productStr.split(Product.PR_SEPARATOR);

        int id = Integer.parseInt(productInfo[0]);
        String productName = productInfo[1];
        double price = Double.parseDouble(productInfo[2]);
        double weight = Double.parseDouble(productInfo[3]);
        String color = productInfo[4];
        int productCount = Integer.parseInt(productInfo[5]);
        int size = Integer.parseInt(productInfo[6]);
        boolean isNaturalSkin = Boolean.parseBoolean(productInfo[7]);

        return new Boots(id, productName, price, weight, color, productCount, size, isNaturalSkin);
    }

    public static Cloth convertToCloth(String productStr)
    {
        String[] productInfo = productStr.split(Product.PR_SEPARATOR);

        int id = Integer.parseInt(productInfo[0]);
        String productName = productInfo[1];
        double price = Double.parseDouble(productInfo[2]);
        double weight = Double.parseDouble(productInfo[3]);
        String color = productInfo[4];
        int productCount = Integer.parseInt(productInfo[5]);
        String size = productInfo[6];
        String material = productInfo[7];

        return new Cloth(id, productName, price, weight, color, productCount, size, material);
    }

    public static Product convertToProduct(String productStr)
    {
        String[] productInfo = productStr.split(Product.PR_SEPARATOR);

        int id = Integer.parseInt(productInfo[0]);
        String productName = productInfo[1];
        double price = Double.parseDouble(productInfo[2]);
        double weight = Double.parseDouble(productInfo[3]);
        String color = productInfo[4];
        int productCount = Integer.parseInt(productInfo[5]);

        return new Product(id, productName, price, weight, color, productCount);
    }
}

