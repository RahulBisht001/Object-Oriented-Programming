package staticExample;

public class Human {
    int age;
    String name;
    boolean married;
    int salary;
    static int population;
    public Human(int age, String name, boolean married, int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        Human.population += 1;
    }
}
