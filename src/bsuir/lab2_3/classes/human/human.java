package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Food;

public abstract class human {
    public human(String _name)
    {
        name=_name;
    }
    protected String name;
    public void eat(Food food)
    {
        System.out.println(food.getTaste());
        food.setCount(0);
        food.setName(null);
        food.setTaste(null);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String _name)
    {
        name=_name;
    }

}
