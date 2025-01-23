package abstractDemo.prep;

public class Square extends Shape{

    Square(){
        super();

        System.out.println("Square constructor called");
    }
    @Override
     void area(){
        System.out.println("This is area");
     }

     void draw(){
         System.out.println("Draw Square");
     }

}

class Chotu extends Square{
    @Override
    void draw(){
         System.out.println("Draw Chotu");
     }
}
