import java.util.Scanner;
public class GradeCalculator{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks out of 100 in Maths: ");
        int math = scanner.nextInt();
        System.out.print("Enter the marks out of 100 in English: ");
        int english = scanner.nextInt();
        System.out.print("Enter the marks out of 100 in Computer: ");
        int computer = scanner.nextInt();
        System.out.print("Enter the marks out of 100 in Science: ");
        int science = scanner.nextInt();
        System.out.print("Enter the marks out of 100 in Social Science: ");
        int ssc = scanner.nextInt();
        
        int total = calculateTotalMarks(math,english,computer,science,ssc);
        System.out.println("");
        System.out.print("The total marks are as follows: " + total);
        System.out.println("");
        int avg = (total/5);
        System.out.print("Average marks are as follows: " + avg);
        System.out.println("");
        if(avg >= 90 && avg <= 100){
            System.out.println("Your grade is A+");
        }
        if(avg >= 80 && avg < 90){
            System.out.println("Your grade is A");
        }
        if(avg >= 70 && avg < 80){
            System.out.println("Your grade is B+");
        }
        if(avg >= 60 && avg < 70){
            System.out.println("Your grade is B");
        }
        if(avg > 50 && avg < 60){
            System.out.println("Your grade is C+");
        }
        if(avg >= 40 && avg <= 50){
            System.out.println("Your grade is C");
        }
        if(avg < 40 && avg > 0){
            System.out.println("You are failed.");
        }
    }
    public static int calculateTotalMarks(int m,int e,int sc,int c, int ssc){
        return m+e+sc+c+ssc;
    }
}
