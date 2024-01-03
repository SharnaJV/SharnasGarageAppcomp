public class Parts
{
    private String itemName;
    private Double itemPrice;

    private boolean isGenuine;

    Parts(String itemName,double itemPrice, boolean isGenuine, int index)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isGenuine = isGenuine;

    }

    Parts()
    {

    }

    public String getName()
    {
        return itemName;
    }
    public double getPrice()
    {
        return itemPrice;
    }
    public boolean getIsGenuine()
    {
        return isGenuine;
    }
}
