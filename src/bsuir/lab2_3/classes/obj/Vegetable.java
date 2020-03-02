package bsuir.lab2_3.classes.obj;

public class Vegetable extends Obj
{
    private String type;
    private String color;
    public Vegetable (String name,String type,String color, int count)
    {
        super(name,count);
        this.type=type;
        this.color=color;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
