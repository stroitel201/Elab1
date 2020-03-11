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

}
