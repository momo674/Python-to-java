import java.util.*;
public class lec3 {
    public static void main(String[] args){
        //used to test questions
    }
    public static void q1(){
        System.out.println("Welcome to Momo Hortons!");
        Scanner coffeecollect = new Scanner(System.in);
        System.out.print("How many Coffees would you like? ($2 ea): ");
        int coffecount = coffeecollect.nextInt();
        int coffeprice = coffecount * 2;

        Scanner muffincollect = new Scanner(System.in);
        System.out.print("How many muffins would you like? ($4 ea): ");
        int muffincount = muffincollect.nextInt();
        int muffinprice = muffincount *4;
        int totalbill = muffinprice + coffeprice;

        System.out.println("The total of your bill is $" + totalbill + ". You ordered " + coffecount  + " coffees and " + muffincount + " muffins." );
        coffeecollect.close();
        muffincollect.close();
    }
    public static void q2(){
        Scanner firstname_scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = firstname_scan.next();

        Scanner lastname_scan = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastname = lastname_scan.next();

        String fullname_upper = firstname.toUpperCase() + " " + lastname.toUpperCase();
        System.out.println(fullname_upper);

        firstname_scan.close();
        lastname_scan.close();

    }
    public static void q3(){
        Scanner firstname_scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = firstname_scan.next();

        Scanner lastname_scan = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastname = lastname_scan.next();

        String fullname_lower = firstname.toLowerCase() + " " + lastname.toLowerCase();
        System.out.println(fullname_lower);

        firstname_scan.close();
        lastname_scan.close();
    }
    public static void q4(){
        Scanner name_input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = name_input.next();

        Scanner password_input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = password_input.next();

        int password_length = password.length();
        String password_anonymous = "*".repeat(password_length);
        System.out.println("Welcome " + name + ". Your password is " + password_anonymous + ". The length of your password is " + String.valueOf(password_length) +".");
        name_input.close();
        password_input.close();

    }
}
