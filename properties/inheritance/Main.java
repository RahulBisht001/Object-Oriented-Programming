package properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(6.9);
//        System.out.println("length " + box2.l + " width "
//                + box2.w + " height " + box2.h);

//        BoxWeight bw = new BoxWeight(4.5, 131.4);
//        System.out.println("length " + bw.l + " width " + bw.w
//                + " height " + bw.h + " weight " + bw.weight);


        /**
         * Most important concept in inheritance
         *
         * Box box5 = new BoxWeight(4.5, 4.5);
         *         System.out.println(box5.l);
         *         System.out.println(box5.weight);
         *         // not able to access the weight variable of BoxWeight class.
         *         // due to Reference variable of type Box
         *
         *
         *         // Not allowed
         *         // BoxWeight box4 = new Box();
         *         // BoxPrice bp = new BoxPrice(45);
         */


        BoxWeight box6 = new BoxPrice(4.5, 69, 78);
        System.out.println(box6.l);

    }
}
