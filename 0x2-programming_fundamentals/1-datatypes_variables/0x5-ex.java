import java.util.Scanner;

class Example5 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.print("Please enter your income: ");
        double tax = nc.nextDouble()*0.14;

        System.out.print("Your Salary after taxes will be ");
        System.out.printf("%,.3f.", tax);
    }
}