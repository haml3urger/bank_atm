import java.util.Scanner;

class bank{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(" 1  for cash withdraw");
        System.out.println("2  for  deposit ");
        System.out.println("3 for balance check ");
        System.out.println("4 to exist");
        int balance = 5000, withdraw, deposit, total;

        int a;
         a = sc.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("enter the amount you want to withdraw");
                withdraw = sc.nextInt();
                if (withdraw < (balance - 500) && (withdraw - balance <= 500)) {
                    total = balance - withdraw;
                    System.out.println("your remainting balance is " + total);
                } else if ((withdraw < balance) && (withdraw - balance >= 500)) {
                    System.out.println("You must have 500 in your account");
                } else {
                    total = withdraw - balance;
                    System.out.println("you are missing " + total);
                }
            }
            case 2 -> {
                System.out.println("enter the amount you want to deposit");
                deposit = sc.nextInt();
                total = balance + deposit;
                System.out.println(total + " has been added to your account");
            }
            case 3 -> System.out.println("Your current balance is " + balance);
            case 4 -> System.out.println("Have a great time.");
            default -> System.out.println("Your input was invalid");
        }


    }
}