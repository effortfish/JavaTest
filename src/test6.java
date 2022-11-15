public class test6 implements test5 {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void move() {
        System.out.println("jump");
    }

    @Override
    public void age() {
        System.out.println(12);
    }

    @Override
    public void name() {
        System.out.println("panda");
    }
}
