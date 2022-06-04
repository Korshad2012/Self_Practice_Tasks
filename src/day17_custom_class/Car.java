package day17_custom_class;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(make + " is starting");
    }

    public void driving(){
        System.out.println(make + " is driving");
    }
    public void parking(){
        System.out.println(make + " is parking");
    }

}
