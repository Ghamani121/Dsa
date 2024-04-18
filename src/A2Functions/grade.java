package A2Functions;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        int n=in.nextInt();
        System.out.println(marks(n));
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//                <=40          Fail
    }
    static String marks(int n) {
        String grade;
        if(n<=100 && n>90) {
            grade="AA";
        }
        else if(n<=90 && n>80) {
            grade="AB";
        }
        else if(n<=80 && n>70) {
            grade="BB";
        }
        else if(n<=70 && n>60) {
            grade="BC";
        }
        else if(n<=60 && n>50) {
            grade="CD";
        }
        else if(n<=50 && n>40) {
            grade="DD";
        }
        else grade="Fail";
        return grade;
    }
}
