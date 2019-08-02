package com.courses.task_pattern.builder;

public class Builder {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setModel("Audi")
                .setTransmission(Transmission.AUTO)
                .setSpeed(220)
                .build();
        System.out.println(car);
    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    String model;
    Transmission transmission;
    int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}

class CarBuilder {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder setModel(String m) {
        this.m = m;
        return this;
    }

    CarBuilder setTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder setSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setModel(m);
        car.setTransmission(t);
        car.setSpeed(s);
        return car;
    }
}
