package Oops.abstraction;

 interface VehicleIdea {
    void wheel();

    void start();

    void stop();

    default void light() {
        System.out.println("Need lights");
    }
}
