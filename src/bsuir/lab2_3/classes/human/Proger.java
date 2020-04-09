package bsuir.lab2_3.classes.human;

import javafx.scene.control.TextArea;

public class Proger extends Human
{
        public Proger(){super();}
        public Proger(String name)
        {
            super(name);
        }
        public void toCode(TextArea txt)
        {
            txt.setText("Пишу код");
        }

}
