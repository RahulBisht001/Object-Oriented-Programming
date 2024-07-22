package abstractDemo;

public class Daughter extends Parent {
    Daughter(long wealth) {
        this.wealth = wealth;
    }

    @Override
    void career(String name) {
        System.out.println("I am in Daughter subClass");
        System.out.println("I want to be an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner is " + name + " she is " + age);
    }
}
