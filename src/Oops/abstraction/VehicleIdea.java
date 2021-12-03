package Oops.abstraction;

public interface VehicleIdea {
    void wheel();

    void start();

    void stop();

    default void light() {
        System.out.println("Need lights");
    }
}
