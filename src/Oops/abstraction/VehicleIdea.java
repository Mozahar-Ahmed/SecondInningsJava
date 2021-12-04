package Oops.abstraction;

interface VehicleIdea {
    //Interface methods are by default abstract and public
    void wheel();

    void start();

    default void light() {
        System.out.println("Need lights");
    }
}
