package com.courses.task_pattern.abstrat_factory;

class AbstractFactory {
    public static void main(String[] args) {
        Factory factory = new ForeignFactory();
        //Factory factory = new UkraineFactory();

        Automobile automobile = factory.getAutomobile();
        Motorbike motorbike = factory.getMotorbike();
        Bicycle bicycle = factory.getBicycle();

        automobile.fillTank(100);
        automobile.testDrive();
        motorbike.checkEngine();
        motorbike.checkOil();
        bicycle.checkTire();
        bicycle.sellBicycle(505);
    }
}

interface Motorbike {
    void checkEngine();
    void checkOil();
}

interface Automobile {
    void fillTank(int value);
    void testDrive();
}

interface Bicycle {
    void checkTire();
    void sellBicycle(int value);
}

interface Factory {
    Motorbike getMotorbike();
    Automobile getAutomobile();
    Bicycle getBicycle();
}

class ForeignMotorbike implements Motorbike {
    public void checkEngine() {
        System.out.println("Motorbike Engine is OK");
    }

    public void checkOil() {
        System.out.println("Motorbike Oil checked");
    }
}

class ForeignAutomobile implements Automobile {
    public void fillTank(int value) {
        System.out.printf("automobile Tank was filled on %s liters %n", value);
    }

    public void testDrive() {
        System.out.println("TestDrive auto was done");
    }
}

class ForeignBicycle implements Bicycle {
    public void checkTire() {
        System.out.println("Bicycle tires are OK");
    }

    public void sellBicycle(int value) {
        System.out.printf("Bicycle was sold out %s dollars ", value);
    }
}

class UkraineMotorbike implements Motorbike {
    public void checkEngine() {
        System.out.println("Двигательно мотоцикла норм");
    }

    public void checkOil() {
        System.out.println("Масло в мотик следует долить!!!");
    }
}

class UkraineAutomobile implements Automobile {
    public void fillTank(int value) {
        System.out.printf("Добавили в жигули топлива %s литров %n", value);
    }

    public void testDrive() {
        System.out.println("Прокатились на автомобиле, почти мерс");
    }
}

class UkraineBicycle implements Bicycle {
    public void checkTire() {
        System.out.println("Резину у велика стоит подкачать");
    }

    public void sellBicycle(int value) {
        System.out.printf("Продали велик соседу за %s гривен %n", value);
    }
}

class ForeignFactory implements Factory {
    public Motorbike getMotorbike() {
        return new ForeignMotorbike();
    }

    public Automobile getAutomobile() {
        return new ForeignAutomobile();
    }

    public Bicycle getBicycle() {
        return new ForeignBicycle();
    }
}

class UkraineFactory implements Factory {
    public Motorbike getMotorbike() {
        return new UkraineMotorbike();
    }

    public Automobile getAutomobile() {
        return new UkraineAutomobile();
    }

    public Bicycle getBicycle() {
        return new UkraineBicycle();
    }
}