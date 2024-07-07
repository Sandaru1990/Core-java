import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Math score: ");
        int math = s.nextInt();

        System.out.print("Enter Science score: ");
        int science = s.nextInt();

        System.out.print("Enter English score: ");
        int english = s.nextInt();

        double average = (math + science + english) / 3.0;

        String grade;

        if (math < 30 || science < 30 || english < 30)
        {
            grade = "F";
        } else 
        {
            if (average >= 90) 
            {
                grade = "A";
            } else if (average >= 70 && average <=89) 
            {
                grade = "B";
            } else if (average >= 50 && average <=69) 
            {
                grade = "C";
            } else 
            {
                grade = "F";
            }
        }
        System.out.println("Final Grade: " + grade);
    }
}
