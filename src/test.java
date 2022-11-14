public class test
{
    public void test(int a)
    {
        System.out.println(a);
    }

    public void test(int a,int b) //重载：方法名字一定要相同，参数一定要不同，返回类型可以不同。主要是用于构造器。
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        animal a = new animal();
        animal b = new dog();
        //a.move();
        //b.move();
        test t = new test();
        t.test(10);
        t.test(10,20);
    }
}
