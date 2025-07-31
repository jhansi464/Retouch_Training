package Assesment;

public class TypeCasting {
    public static void main(String[] args) {
        int a=9;
        double b=4.0;
        double result=(double) a+b;
        double div=a/b;
        boolean result1= a> (int) b;
        boolean result2=(a%3==0) && b>2.5;
        System.out.println("Sum(a+b): " +result);
        System.out.println("Division(a/b): "+div);
        System.out.println("Is a >(int)b?: " +result1);
        System.out.println("Is a divisible by 3 and b > 2.5: " +result2);

    }
}
