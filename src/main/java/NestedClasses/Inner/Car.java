package NestedClasses.Inner;

public class Car {

    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;

    }
        @Override
        public String toString () {
            return " My car is " + color + " and " + ", doorCount = " + doorCount + engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

        public class Engine {
            int hoursPower;

            public Engine(int hoursPower) {
                this.hoursPower = hoursPower;
            }

            @Override
            public String toString() {
                return " My Engine have a " +
                       "hoursPower = " + hoursPower;

            }
        }

    }

    class Test {
        public static void main(String[] args) {
//            Car.Engine engine = new Car.Engine(300);
            Car car = new Car("black", 5);
            Car.Engine engine = car.new Engine(266);
            car.setEngine(engine);
            System.out.println(engine);
            System.out.println(car);
        }
    }

