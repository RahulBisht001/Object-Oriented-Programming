package interfaces;

public interface Engine {

    /**
     * The price variable is by default
     * static and final
     */
    static final int PRICE = 7654980;
    void start();

    void stop();

    void acc();
}
