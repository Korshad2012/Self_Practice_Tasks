package day17_custom_class;

public class Student {

    public String name;
    public char gender;
    public String studentID;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, String studentID, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

}
