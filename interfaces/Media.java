package interfaces;

public interface Media {
    void start();
    void stop();

    static void working(){
        System.out.println("Media player working fine");
    }

}
