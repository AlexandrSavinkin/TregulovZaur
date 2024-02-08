package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("mers", "black", 3.4));
        System.out.println("MyCars : " + ourCars);

        changeCar(ourCars.get(0)
                , car -> {
                    car.color = "green";
                    car.engine = 2.5;
                    System.out.println("Upgrade car to " + car);
                });
        System.out.println("MyCars : " + ourCars);
    }
}
    class Car {
        String model;
        String color;
        double engine;

        public Car(String model, String color, double engine) {
            this.model = model;
            this.color = color;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Supplier{" +
                   "model='" + model + '\'' +
                   ", color='" + color + '\'' +
                   ", engine=" + engine +
                   '}';
        }

    }
