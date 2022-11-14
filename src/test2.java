public class test2
{
    private int a;
    private int b;
    private int c;

    public test2(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public test2(int a)
    {
        this.a = a;
    }

    public void print(int a)
    {
        System.out.println(a);
    }

    public void print()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        test2 t2 = new test2(10);
        test2 t3 = new test2(20,30,40);
        t3.print();
        t2.print(t2.a);
    }
}
