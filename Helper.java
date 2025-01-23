public class Helper {
    public static void main(String[] args) {

//        Child ch = new Child();
//        ch.info();
//        ch.show();
//        ch.getB();
//        ch.help();

          Computer c1 = new Desktop();

          Developer d = new Developer();
          d.buildApp(c1);


    }
}

interface A{
    public void show();

    private void AA(){
        System.out.println("this is AA");
    }

    default void help(){
        System.out.println("Help");
    }
}

interface B{
    public void show();

    default void getB(){
        System.out.println("This is B");
    }
}

class Child implements A,B{

    @Override
    public void show(){
        System.out.println("This is show");
    }

    public void info(){
        System.out.println("Info");
    }
}

//
//abstract class Computer{
//    abstract void code();
//}
//
//class Desktop extends Computer{
//    public void code(){
//        System.out.println("Coding using Desktop");
//    }
//}
//class Laptop extends Computer{
//    @Override
//    public void code(){
//        System.out.println("Coding using laptop");
//    }
//}
//
//
//class Developer{
//    public void buildApp(Computer cm){
//       cm.code();
//    }
//}


interface Computer {
    void code();
    private void AA(){
        System.out.println("this is AA");
    }

}

class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding using Desktop");
    }
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding using laptop");
    }
}

class Developer {
    public void buildApp(Computer computer) {
        computer.code();

    }
}