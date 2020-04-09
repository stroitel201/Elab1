package bsuir.lab2_3.classes.obj;

public abstract class Obj {
    public Obj(){name="Obj"; count=0;}
    public Obj(String name, int count)
    {
        this.name=name;
        this.count=count;
    }
    protected String name;
    protected int count;

    public void setName(String name)
    {
        this.name =name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }
}
