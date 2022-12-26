import java.util.*;
public class lectwotwo {
    public static void main(String[] args){
        q6();

    }
    public static void q1(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a number for it to get squared: ");

        int input_number = scan.nextInt();
        int squared_number =  input_number*input_number ;
        System.out.println(squared_number);
        scan.close();
    }
    public static void q2(){
        //Write a program that asks the user to enter two numbers and then displays their sum.
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int firstnum = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter your second number ");
        int secondnum = num2.nextInt();

        
       
        int finalnum = firstnum + secondnum;
        System.out.println(finalnum);
    }
    public static void q3(){
        Scanner n1 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstnum = n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        int secondnum = n2.nextInt();

        Scanner n3 = new Scanner(System.in);
        System.out.print("Enter your third number: ");
        int thirdnum = n3.nextInt();

        int finalnum = (firstnum + secondnum + thirdnum) / 3;
        System.out.println("The mean is: " + finalnum); 
    }
    public static void q4(){
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        System.out.println("The number you typed is: " + num.nextFloat());
    }
    public static void q5(){
        Scanner namecollector = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = namecollector.next();
        System.out.println("Hello " +name + ". Good luck on your test.");
    }
    public static void q6(){
        Scanner n1collect = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int n1 = n1collect.nextInt();

        Scanner n2collect = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        int n2 = n2collect.nextInt();
        int finalnum = n1 % n2;
        System.out.println(finalnum);

    }
}
