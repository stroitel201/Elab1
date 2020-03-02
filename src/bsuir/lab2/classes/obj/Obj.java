package bsuir.lab2.classes.obj;

public abstract class Obj {
    public Obj(String _name, int _count)
    {
        name=_name;
        count=_count;
    }
    protected String name;
    protected int count;

    public void setName(String _name)
    {
        name =_name;
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
