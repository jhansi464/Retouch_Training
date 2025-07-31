package Assesment;

public class RelationalAndLogical {
    public static void main(String[] args) {
        int age=20;
        int score=75;
        int passMarks=50;
        boolean passed= score>=passMarks;
        boolean result=(age>=18) && passed;
        System.out.println("Did the student pass?: " +passed);
        System.out.println("Is the student an adult and passed?: "+result);
    }
}
