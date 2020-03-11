package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;
import bsuir.lab2_3.classes.obj.Vegetable;
import javafx.scene.control.TextArea;


public class Chef extends human
{
    public Chef(String name)
    {
        super(name);
    }
    public Food cook(String name, String taste, int count, Vegetable veg)
    {
        veg.setName(null);
        veg.setColor(null);
        veg.setType(null);
        veg.setCount(0);
        return new Food(name,taste,count);
    }

}
