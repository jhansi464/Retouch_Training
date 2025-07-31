package Assesment;

public class Switch {
    public static void main(String[] args) {
        int num=11;
        switch(num%2){
            case 0 :
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Odd Number");
                break;
            default :
                System.out.println("Unexcepted value");
        }
    }
}
