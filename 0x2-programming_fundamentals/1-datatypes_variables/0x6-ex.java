import java.util.Scanner;

class Example6 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.print("Please enter the radius: ");
        double hRad = nc.nextDouble()/2.0;

        double area = 3.14 * (hRad * hRad);

        System.out.print("The area of the circle is ");
        System.out.printf("%,.3f.", area);
    }
}