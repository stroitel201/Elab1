package bsuir.lab2.classes.human;

import bsuir.lab2.classes.obj.Vegetable;

public class Farmer extends human
{
    public Farmer(String _name)
    {
        super(_name);
    }

    private void toWater()
    {
        System.out.println("Овощ поливаю");
    }
    private void toSeed()
    {
        System.out.println("Посадил овощ");
    }
    public Vegetable toGrow(String _name,String _type, String _color, int _count)
    {
        toSeed();
        toWater();
        System.out.println("Вырастил овощ");
        return new Vegetable(_name,_type,_color,_count);
    }
}
