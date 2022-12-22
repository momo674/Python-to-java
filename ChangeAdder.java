public class ChangeAdder {
    public static void main(String[] args) {
        int quarters = 10;
        int dimes = 3;
        int nickles = 7;
        int pennies = 6;
        int cents = 25*quarters + 10*dimes +5*nickles + pennies;
        System.out.println("total in cents is:" + cents);
    }
}

//To print a line in Java, println = print line
//it only yakes one argument, while python takes many
//every variable must be defined by str or int or float