package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.awt.*;

public abstract class human {
    public human(String name)
    {
        this.name=name;
    }
    protected String name;
    public void eat(Food food, TextArea txt)
    {
        txt.setText(food.getTaste());
        food.setCount(0);
        food.setName(null);
        food.setTaste(null);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

}
