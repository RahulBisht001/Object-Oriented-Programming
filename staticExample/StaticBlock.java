package staticExample;

public class StaticBlock {

    static int a = 4;
    static int b;

    // This static block will only run once,
    // i.e., when the class is loaded for the first time.

    static {
        System.out.println("I am in static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println("a is " + StaticBlock.a + " and b is " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println("a is " + StaticBlock.a + " and b is " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println("a is " + StaticBlock.a + " and b is " + StaticBlock.b);

    }
}
