package day17_custom_class;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Korshad",'M',"KD20220418",'A',true);
        System.out.println(student1);
        student1.study();

    }
}
