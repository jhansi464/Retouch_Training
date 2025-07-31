package Assesment;

public class ArthimeticPrecision {
    public static void main(String[] args) {
        double x=7.0;
        int y=2;
        double result=x/y;
        double result1=x/(double) y;
        System.out.println("Division result without casting: "+result);
        System.out.println("Division result with casting: " +result1);
    }
}
