package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;
import bsuir.lab2_3.classes.obj.Vegetable;


public class Chef extends human
{
    public Chef(String _name)
    {
        super(_name);
    }
    public Food cook(String _name, String _taste, int _count, Vegetable veg)
    {
        veg.setName(null);
        veg.setColor(null);
        veg.setType(null);
        veg.setCount(0);
        return new Food(_name,_taste,_count);
    }
}
