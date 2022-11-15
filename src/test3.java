public abstract class test3
{
    private int a;
    private int b;

    public test3(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }

    public void print1()
    {
        System.out.println(20);
    }

    public abstract void print3();
}
