package exceptionHandling;

//public class MyException extends RuntimeException {
//
//    public MyException(String message) {
//        super(message);
//    }
//}


public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}
