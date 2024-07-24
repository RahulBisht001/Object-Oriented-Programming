package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // This is an example of Unchecked Exception
//        int a = 5;
//        int b = 0;
//        int c = a / b;

        // This is an example of Check Exception
//        BufferedReader reader = new BufferedReader(new FileReader("/t2t.png"));

        int a = 5, b = 0;

        try {
//            int c = a / b;
//            int c = divide(a, b);
//            throw new Exception("My Custom exception");

            String name = "Rahul";
            if (name.equals("Rahul"))
                throw new MyException("Your Exception");

            // this is the point of failure i, created for my custom Exception

            /**
             * Very, very important point
             * in your MyException class. because we are extending it form
             * Exception class. hence it is treated as CompileTime / Checked
             * exception which shows error on compile time (if there is not point of
             * custom exception in try block)
             *
             * hence, if you strictly want your custom exception to be treated as Runtime
             * exception without even a single point of failure/exception.than extend your
             * exception from RuntimeException instead of Exception.
             *
             */

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("No matter which block executes.I always Executes");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Lawde 0 se kon divide karta hai");
        return a / b;
    }
}
