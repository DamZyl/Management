package Enity;

public class Product
{
    private int id;
    private String productName;
    private double price;
    private double weight;
    private String color;
    private int productCount;

    public Product(int id, String productName, double price, double weight, String color, int productCount) // zrobic warunki
    {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public int getId()
    {
        return id;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }

    public int getProductCount()
    {
        return productCount;
    }

    public void setProductCount(int productCount)
    {
        this.productCount = productCount;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "id = " + this.getId() +
                ", productName = '" + this.getProductName() + '\'' +
                ", price = " + this.getPrice() +
                ", weight = " + this.getWeight() +
                ", color = '" + this.getColor() + '\'' +
                ", productCount = " + this.getProductCount() +
                '}';
    }
}
