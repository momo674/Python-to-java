public class Assignment_1 {
    public static int count_even_digits(int a, int b){
        int counter = 0;
        String c = Integer.toString(a);
         for (int i = 0; i < b; i++){
             char character = c.charAt(i);
             int numbercheck = character;
             if (numbercheck % 2 == 0){
                counter++;
             }
         }
         return counter;
    }
    public static String encrypt(String input)
    {
        int input_length = input.length() ;
        String final_result = "";
        for (int i = 0; i < input_length/2 ; i++)
        {
            final_result = final_result + Character.toString(input.charAt(input_length - i - 1)) + Character.toString(input.charAt(i));
        }
        if (input_length%2 != 0){
            final_result = final_result + input.charAt((input_length-1)/2);
        }
        return final_result;
    }
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
