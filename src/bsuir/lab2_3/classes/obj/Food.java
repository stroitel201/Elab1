package bsuir.lab2_3.classes.obj;

public class Food extends Obj
{
    private String taste;
    public Food (String _name,String _taste, int _count)
    {
        super(_name,_count);
        taste=_taste;
    }

    public void setTaste(String taste)
    {
        this.taste = taste;
    }

    public String getTaste()
    {
        return taste;
    }
}
