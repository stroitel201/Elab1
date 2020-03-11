package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Proger extends human
{
        public Proger(String name)
        {
            super(name);
        }
        public void toCode(javafx.scene.control.TextArea txt)
        {
            txt.setText("Пишу код");
        }
    @Override
    public void eat(Food food, TextArea txt)
    {
        txt.setText(food.getTaste()+" прогер поел");
        food.setCount(0);
        food.setName(null);
        food.setTaste(null);
    }
}
