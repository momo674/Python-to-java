import java.lang.Math;
public class lab2 {
    public static String repeater(String s1,String s2,int n){
        String last =  (s1 + s2).repeat(n);
        return "_" + last + "_" ;
    }
    public static String roots(double a, double b, double c){
        double x1 = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b) - (4*a*c)))/(2*a);
        String f = "x1 = " + String.valueOf(x1) + " x2 = " + String.valueOf(x2);
        return f;
    }
    public static Boolean real_roots(double a, double b, double c){
        double det = (b*b) - (4*a*c);
        if (det >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int reverse(int x){
        int n = (x%10)*10 + (x/10);
        return n;
    }
    public static void main(String[] args){
        System.out.println(real_roots(1,1,5));
    }
}
