package bsuir.lab2_3.classes.obj;

public class Food extends Obj
{
    private String taste;
    public Food (String name,String taste, int count)
    {
        super(name,count);
        this.taste=taste;
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
