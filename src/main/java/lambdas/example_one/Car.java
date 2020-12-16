package lambdas.example_one;

public class Car {

    private String brand;
    private int date;

    Car(String brand, int age) {
        this.brand = brand;
        this.date = age;
    }

    public String getBrand() {
        return brand;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
