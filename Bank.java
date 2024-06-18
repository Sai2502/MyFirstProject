import java.util.Scanner;

public class Bank {
    static int currentBalance = 1500;

    public static void greetingApplication() {
        System.out.println("Hello ICICI");
    }

    public static void depositAmount(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Deposit amount: " + amount);
        System.out.println("Current balance: " + currentBalance);
    }

    public static void main(String[] args) {
        greetingApplication();
      
    }
}
