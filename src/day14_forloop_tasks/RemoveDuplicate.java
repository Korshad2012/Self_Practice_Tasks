package day14_forloop_tasks;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str ="aabbcccc";

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;
            }

        }
        System.out.println(result);
    }
}
