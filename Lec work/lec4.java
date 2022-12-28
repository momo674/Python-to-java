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
    public static void q2(){
        Scanner age_collector = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = age_collector.nextInt();

        if (age < 18){
            System.out.println("Sorry, you cannot vote due to being under 18.");
        }
        else{
            Scanner city_collector = new Scanner(System.in);
            System.out.print("Do you live in Ottawa? ");
            String city = city_collector.next();
            if(!city.matches("Yes|yes|y|y")){
                System.out.println("Sorry, you cannot vote due to not living in Ottawa.");
            }
            else
            {
                Scanner province_collector = new Scanner(System.in);
                System.out.print("Do you live in Ontario?");
                String province = province_collector.next();
                if (!province.matches("Yes|yes|y|Y"))
                {
                    System.out.println("Sorry, you cannot vote due to not living in Ontario.");
                }
                else
                {
                    Scanner background_collector = new Scanner(System.in);
                    System.out.print("Do you have a criminal record? (True or False) ");
                    boolean background = background_collector.nextBoolean();
                    if (background == false){
                        System.out.println("Sorry you cannot vote.");
                    }
                    else{
                        System.out.print("Congrats you can vote!");
                    }
                    
                    
                }
            }
        }
    }
        
        

}
    
