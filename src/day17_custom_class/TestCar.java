package day17_custom_class;

public class TestCar {

    public static void main(String[] args) {

        Car car1= new Car();

        car1.setInfo("Mercedes Benz","Class A", 2020,"White",50000);

        System.out.println(car1);
        car1.start();

        Car car2 = new Car();

        car2.setInfo("Mini Cooper","Mini Cooper",2013,"black and white",45000);
        System.out.println(car2);

        car2.start();

    }
}
