import java.util.Scanner;

/**
 * Created by tahsin on 3/24/2017.
 */
public class Class_average {

    public static void main(String[] args) {
        // 3 Exams were given
        //150 questions for each
        //Final grade is sum of all correct in exam 1,2,3 divided by 450

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score in Exam1");
        int Exam1 = input.nextInt();
        System.out.println("Enter your score in Exam2");
        int Exam2 = input.nextInt();
        System.out.println("Enter your score in Exam3");
        int Exam3 = input.nextInt();
        int total = Exam1+Exam2+Exam3;

        int finalGrade = total * 100 / 450;

        System.out.println("Your average score for the course is : "+finalGrade);
        System.out.println("Your total points for the cours is : " + total);

        // Today 24th of March I will be testing the life of XPS battery by keeping it on without charger thethered for as long as it can last Started at 9:40
        //It is now 3:51pm and the power XPS has about 28% power left



    }
}
