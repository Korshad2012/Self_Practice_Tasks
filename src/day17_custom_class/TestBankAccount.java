package day17_custom_class;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount object1= new BankAccount();
        object1.setInfo("Gadir",123456789);

        System.out.println(object1);

        object1.deposit(1000);

        object1.checkBalance();

        object1.withdraw(700);

        object1.checkBalance();

        object1.deposit(-1000);

        object1.checkBalance();


    }
}
