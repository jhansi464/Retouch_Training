package Assesment;

public class GradeEvaluator {
    public static void main(String[] args) {
        int score=73;
        char grade = 0;
        if(score>=90){
            grade ='A';
        }
        else if(score>=75){
            grade ='B';
        }
        else if(score>=60){
            grade ='C';
        }
        else if(score<60){
            grade ='D';
        }
        System.out.println("Grade:" + grade);
    }
}
