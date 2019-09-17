import java.io.*;
import java.util.*;

public class Recipe
{
    private static ArrayList<Ingredient> list;// = new ArrayList<Ingredient>();
    private String name;
    private String description;
    
    public Recipe(String rName, String rDescription, ArrayList<Ingredient> rList)
    {
        name = rName;
        description = rDescription;
        list = rList;
    }
    
    public Recipe()
    {
        name = "Holder";
        description = "Holder";
        list = new ArrayList<Ingredient>();
    }
    
    public void setName(String nName)
    {
        name = nName;
    }
    
    public void setDes(String nDes)
    {
        description = nDes;
    }
    
    public void addList(String iName, int iAmount, String iUnit)
    {
        list.add(new Ingredient(iName, iAmount, iUnit));
    }
    
    public void addList(Ingredient temp)
    {
        list.add(temp);
    }
    
    public String toString()
    {
        String res = "";
        
        try
        {
            if (!(name.equals("")))
            {
                res = name + "\n";
            }
        } catch(NullPointerException ex) 
        {
            res = "Holder\n";
        }
        
        res = res + "Description: " + description + "\n";
        
        for(int i = 0; i < list.size(); i++)
        {
            res = res + list.get(i).toString() + "\n";
        }
        
        res = res + "\n";
        
        
        return res; 
    }
}