package bsuir.lab2.classes.obj;

public class Vegetable extends Obj
{
    private String type;
    private String color;
    public Vegetable (String _name,String _type,String _color, int _count)
    {
        super(_name,_count);
        type=_type;
        color=_color;
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
