package properties.inheritance;

public class BoxPrice extends BoxWeight {
    double price;
    double h = 424;

    BoxPrice(double price) {
        super();
        this.price = price;
    }

    BoxPrice(double side, double weight, double price) {
        super(side, weight);
//        System.out.println("++" + super.h);

        this.price = price;
//        System.out.println("++" + this.price);

        System.out.println("parent class variable is " +
                super.h + " and local is " + this.h);
    }

}
