public class dog extends animal
{
    //重写：可以拿父类的方法，然后改变父类方法的核心。好处就是子类可以根据自己的需要来实现父类的方法。
    public void move()
    {
        System.out.println("jump");
    }
    public static void main(String[] args) {
    }
}
