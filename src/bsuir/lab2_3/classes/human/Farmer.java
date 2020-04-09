package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Vegetable;
import javafx.scene.control.TextArea;

public class Farmer extends Human
{
    public Farmer(){super();}
    public Farmer(String name)
    {
        super(name);
    }



    private void toWater(TextArea txt)
    {
        txt.appendText("\nОвощ поливаю");
    }
    private void toSeed(TextArea txt)
    {
        txt.setText("Посадил овощ");
    }
    public Vegetable toGrow(String name,String type, String color, int count, javafx.scene.control.TextArea txt)
    {
        toSeed(txt);
        toWater(txt);
        txt.appendText("\nВырастил овощ");
        return new Vegetable(name,type,color,count);
    }
}
