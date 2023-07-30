import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.println("Please enter what shape you want to calculate it's area.");
        System.out.println("1-Circle 2-Triangle 3-Square.");
        int shape = nc.nextInt();

        if (shape == 1){
          System.out.print("Please enter the radius: ");
          double hRad = nc.nextDouble()/2.0;

          double area = 3.14 * (hRad * hRad);

          System.out.print("The area of the circle is ");
          System.out.printf("%,.3f.", area);
        }else if(shape ==2){
          System.out.print("Please enter the length of the base: ");
          double base = nc.nextDouble();
          System.out.print("Please enter the length of the height: ");
          double height = nc.nextDouble();

          double area = (0.5 * base) * height;

          System.out.print("The area of the triangle is ");
          System.out.printf("%,.3f.", area);          
        }else if(shape == 3){
          System.out.print("Please enter the length of the rid: ");
          double rid = nc.nextDouble();

          double area = rid * 4;

          System.out.print("The area of the square is " + area);
        }else{
          System.out.println("Invalid input!!!.");
        }
    }
}