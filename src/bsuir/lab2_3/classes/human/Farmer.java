package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;
import bsuir.lab2_3.classes.obj.Vegetable;
import com.sun.javafx.tk.quantum.MasterTimer;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Farmer extends human
{
    public Farmer(String name)
    {
        super(name);
    }



    private void toWater(javafx.scene.control.TextArea txt)
    {
        txt.appendText("\nОвощ поливаю");
    }
    private void toSeed(javafx.scene.control.TextArea txt)
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
