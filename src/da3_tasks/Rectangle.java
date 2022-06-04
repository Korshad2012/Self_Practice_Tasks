package da3_tasks;

public class Rectangle {

    public static void main(String[] args) {

        int length = 3;
        double width = 2.5;
        double area = length * width;
        double perimeter = 2*(length + width);
        String size = "The size of the house is ";

        System.out.println(size + area + " Square Feet");
        System.out.println(perimeter);

    }


}
