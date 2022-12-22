import java.util.*;
public class vid3java {
    public static String grade_converter(int number_grade)
    {
        String letter_grade;
        if (number_grade >= 90)
        {
            letter_grade = "A";
        }
        else if (number_grade >= 80)
        {
            letter_grade = "B";
        }
        else if (number_grade>= 70)
        {
            letter_grade = "C";
        }
        else if (number_grade>= 60)
        {
            letter_grade = "D";
        }
        else
        {
            letter_grade = "F";
        }
        return letter_grade;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter your grade: ");
        
        int avg = scan.nextInt();
        
        System.out.println(avg + " = " + grade_converter(avg));
        scan.close();
    }
}

//static is like a function from python
//after static it is the type of dat that will be returned in function (string, int)
//void = nothing, no return
//then write the name of the method(function) with it's parameters
//print --> prints on same line vs println --> prints on new line
//to get user input, we must import java.util.*;
//to create a user input vraible, we must do the following

//Scanner(type of variable) "Any variable name" = new Scanner(System.in)
//to show a message with the Scanner, we must add another print line to it
//System.out.print("whatever you want") or use println if you want to enter info below the message in console
//now we define our variable to be a user collector
// (Vairable type) "Variable name" = "Scanner name" .next___() 
//__ could be int, string or whatever