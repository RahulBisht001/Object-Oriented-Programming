package abstractDemo;

public class Main {
    public static void main(String[] args) {

//        Son son = new Son(100000000000000l);
//        son.career("Entrepreneur");
//
//        son.info();
//        System.out.println(son.wealth);

        /**
         * Important concept in SubClass
         * This is not related with abstract class
         *
         *
         * The only reason why this is here is that I get to know about this
         * concept when I was learning abstract classes from Kunal kushwaha
         * in lecture 5 at timestamps "14:09" - "15:04"
         *
         * ChildClass cc = new ChildClass(23);
         * System.out.println(cc.l + " " + cc.w + " " + cc.h + " ");
         */


        /**
         * Note: -
         *
         *
         * We can't create objects of abstract classes, and if we want,
         * then we need to write the implementation of abstract methods
         * as we are doing here.
         */
        Parent maa = new Parent() {
            @Override
            void career(String name) {
                System.out.println("I am a" + name);
            }

            @Override
            void partner(String name, int age) {

            }
        };

//        System.out.println(maa.wealth);
////        maa.info();
//        maa.career("Housewife");
//
////        Son.info();
//
//        Parent p = new Son(335342);
//        p.career("Soldier");

        Parent.hello();
        Son.hello();

    }
}
