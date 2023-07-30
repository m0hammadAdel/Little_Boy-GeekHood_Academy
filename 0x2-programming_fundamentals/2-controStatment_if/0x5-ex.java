import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        System.out.print("Please enter the sw: ");
        int sw = nc.nextInt();
        System.out.print("Please enter the sa: ");
        int sa = nc.nextInt();

        double result = 625/(sw*sa);

        if(result < 500 && result > 300){
          System.out.println("Please you need to slow down");
        }else if(result > 500){
          System.out.println("Mayday mayday the plane is going down");
        }else{
          System.out.println("Eshta Yaba Eshta!")
        }
    }
}