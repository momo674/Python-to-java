import java.util.*;
public class video2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter your grade: ");
        
        int avg = scan.nextInt();
        String grade;
        if (avg >= 90)
        {
            grade = "A";
        }
        else if (avg >= 80)
        {
            grade = "B";
        }
        else if (avg>= 70)
        {
            grade = "C";
        }
        else if (avg>= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        System.out.println(avg + " = " + grade);
        scan.close();
    }
}