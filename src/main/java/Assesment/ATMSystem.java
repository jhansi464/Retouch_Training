package Assesment;
import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int correct_pin=1234;
        double balance=10000;
        System.out.println("Enter your pin");
        int pin=sc.nextInt();
        if(pin!=correct_pin){
            System.out.println("Login Failed");
            return;
        }
        int ch=0;
        while(ch!=4){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice");
            ch=sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter the balance amount:" +balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:" );
                    double deposit=sc.nextDouble();
                    if(deposit >0){
                        balance+=deposit;
                        System.out.println(deposit);
                        System.out.println(balance);
                    }
                    else{
                        System.out.println("Invalid Deposit");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    double withdraw=sc.nextDouble();
                    if(withdraw<=0){
                        System.out.println("Invalid withdraw");
                    }
                    else if(withdraw>balance){
                        System.out.println("Insufficent funds");
                        System.out.println(balance);
                    }
                    else{
                        balance-=withdraw;
                        System.out.println(withdraw);
                        System.out.println(balance);
                    }
                    break;
                case 4:
                    System.out.println("Good bye...");
                    break;
                default :
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
