package NestedClasses.Static;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return " My car is " + color + " and " + ", doorCount = " + doorCount  + engine;


    }

    public static class Engine{
        int hoursPower;

        public Engine(int hoursPower) {
            this.hoursPower = hoursPower;
        }

        @Override
        public String toString() {
            return " My motor5 have a " +
                   "hoursPower = " + hoursPower;

        }
    }

}

 class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(300);
        System.out.println(engine);

        Car car = new Car("yellow", 5, engine);
        System.out.println(car);

    }
}