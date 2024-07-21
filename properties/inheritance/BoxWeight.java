package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        System.out.println("BoxWeight called");
    }

    BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

}
