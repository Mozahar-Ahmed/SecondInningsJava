package Oops.abstraction;

interface VehicleIdea {
    //Interface methods are by default abstract and public
    //Interface attributes are by default public, static and final
    void wheel();

    void start();

    default void light() {
        System.out.println("Need lights");
    }
}
