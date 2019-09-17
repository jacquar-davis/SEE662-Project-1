

public class Ingredient
{
    private String name;
    private String unit;
    private int amount;
    
    public Ingredient(String iName, int iAmount, String iUnit)
    {
        name = iName;
        unit = iUnit;
        amount = iAmount;
    }
    
    public void setName(String nName)
    {
        name = nName;
    }
    
    public void setAmount(int nAmount)
    {
        amount = nAmount;
    }
    
    public void setUnit(String nUnit)
    {
        unit = nUnit;
    }
    
    public String toString()
    {
        String res = "";
        
        res = name + "; " + amount + " " + unit;
        
        return res;
    }
}