package staticExample;

public class Main {
    public static void main(String[] args) {
        Human rahul = new Human(22,"RahulB",false,1000000);
        Human nikku = new Human(22,"Nikku",true,5000000);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Main obj = new Main();
        obj.greeting();
    }
    public void greeting(){
        System.out.println("Hello Java");
    }

}
