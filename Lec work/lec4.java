import java.util.*;
public class lec4 {
    public static void main(String[] args){
        q1();
    }
    public static void q1()
    {
       class inside {
        String caclulator(int hours, int salary){
            int total_pay = hours * salary;
            String final_pay = "$" + Integer.toString(total_pay);
            return final_pay;
        }
        
       }
       Scanner hour_scan = new Scanner(System.in);
       System.out.print("How many hours did you work? ");
       int total_hours = hour_scan.nextInt();

       Scanner wage_scan = new Scanner(System.in);
       System.out.print("What is your hourly age? ");
       int total_wage = wage_scan.nextInt();

       System.out.print(new inside().caclulator(total_hours,total_wage));
       hour_scan.close();
       wage_scan.close();
    }

        }
    
