package interfaces.extendDemo2;

public interface A {
    default void fun(){
        System.out.println("This is Default Behaviour");
    }
}
