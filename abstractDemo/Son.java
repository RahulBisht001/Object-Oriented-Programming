package abstractDemo;

public class Son extends Parent {

    Son(long wealth) {
        this.wealth = wealth;
    }

    @Override
    void career(String name) {
        System.out.println("I am in Son subClass");
        System.out.println("I want to be an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner is " + name + " she is " + age);
    }
}
