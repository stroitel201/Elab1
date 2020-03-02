package bsuir.lab2_3.classes.human;

import bsuir.lab2_3.classes.obj.Vegetable;

public class Farmer extends human
{
    public Farmer(String name)
    {
        super(name);
    }

    private void toWater()
    {
        System.out.println("Овощ поливаю");
    }
    private void toSeed()
    {
        System.out.println("Посадил овощ");
    }
    public Vegetable toGrow(String name,String type, String color, int count)
    {
        toSeed();
        toWater();
        System.out.println("Вырастил овощ");
        return new Vegetable(name,type,color,count);
    }
}
