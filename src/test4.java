public class test4 extends test3
{
    private int c;
    private int d;

    public test4(int a, int b, int c, int d)
    {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    public void print()
    {
        System.out.println(1);
    }

    @Override
    public void print3() {
        System.out.println(40);
    }

    public static void main(String[] args) {
        test4 t4 = new test4(10,20,30,40);
        test3 t3 = new test4(1,2,3,4);
        t4.print();
        t3.print();
        t4.print1();
    }
}
