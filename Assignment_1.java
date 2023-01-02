public class Assignment_1 {
    public static Boolean month_apart(int month1, int day1, int month2, int day2)
    {
        int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] days_of_months = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month1 == month2){
            return false;
        }
        else {
            if (day1 == day2)
            {
                return true;
            }
            else
            {
                if (day1 > day2){
                    if (month1 > month2)
                    {
                        return true;
                    }
                    else if (month2 > month1)
                    {
                        return false;
                    }
                }
                else if (day2 > day1){
                    if (month2 > month1)
                    {
                        return true;
                    }
                    else if (month1 > month2){
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
       //testing goes ehre
    }
}
