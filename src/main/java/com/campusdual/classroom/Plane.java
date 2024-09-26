package com.campusdual.classroom;

public class Plane implements IMachine {

    private final String name;

    public Plane(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println("El avión despega");
    }

    public void land() {
        System.out.println("El avión aterriza");
    }

    public void fly() {
        System.out.println("El avión está volando");
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void maintenance() {
    }
}
