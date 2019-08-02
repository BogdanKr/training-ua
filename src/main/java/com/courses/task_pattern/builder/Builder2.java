package com.courses.task_pattern.builder;

public class Builder2 {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ZaporozhecBuilder());
        Car2 car2 = director.buildCar();
        System.out.println(car2);
    }
}
    enum Transmission2{
        MANUAL,AUTO
    }
    class Car2{
        String model;
        Transmission2 transmission;
        int speed;

        public void setModel(String model) {
            this.model = model;
        }

        public void setTransmission(Transmission2 transmission) {
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

    abstract class CarBuilder2{
        Car2 car2;
         void createCar(){car2 = new Car2();}
         abstract void setCarModel();
         abstract void setCarTransmission();
         abstract void setCarSpeed();
         Car2 getCar(){return car2;}
    }
    class AudiBuilder extends CarBuilder2{
        void setCarModel() {
            car2.setModel("Audi");
        }
        void setCarTransmission() {
            car2.setTransmission(Transmission2.AUTO);
        }
        void setCarSpeed() {
            car2.setSpeed(300);
        }
    }
    class ZaporozhecBuilder extends CarBuilder2{
        void setCarModel() {
            car2.setModel("Запорожец");
        }
        void setCarTransmission() {
            car2.setTransmission(Transmission2.MANUAL);
        }
        void setCarSpeed() {
            car2.setSpeed(90);
        }
    }
    class Director{
        CarBuilder2 carBuilder2;
        void setBuilder(CarBuilder2 carBuilder2){this.carBuilder2 = carBuilder2;}

        Car2 buildCar(){
            carBuilder2.createCar();
            carBuilder2.setCarModel();
            carBuilder2.setCarTransmission();
            carBuilder2.setCarSpeed();
            Car2 car2 = carBuilder2.getCar();
            return car2;
        }
    }

