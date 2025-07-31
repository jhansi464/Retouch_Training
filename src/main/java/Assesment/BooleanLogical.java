package Assesment;

public class BooleanLogical {
    public static void main(String[] args) {
        boolean isJavaFun=true;
        boolean isChallenging=true;
        boolean result= isJavaFun && !isChallenging;
        boolean result1= isJavaFun || isChallenging;
        System.out.println("Java is fun but not challenging: " +result);
        System.out.println("Either Java is fun or it is challenging: "+result1);
    }
}
