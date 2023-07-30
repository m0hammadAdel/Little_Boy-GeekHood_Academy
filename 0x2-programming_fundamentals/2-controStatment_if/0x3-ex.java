import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        String[] name = {"Manager", "Employee", "Worker"};
        double[] taxFee = {0.2, 0.14, 0.12};

        System.out.print("Please enter your salary: ");
        int salary = nc.nextInt();

        if(salary < 2000){
          System.out.print("God bless you young man go you are called a slave");
        } else {
          for (int i = 0; i < name.length; i++){
            System.out.print((i + 1) + "-" + name[i] + " ");
          }
          System.out.println(".");

          System.out.print("Enter the number of your job name: ");
          int job = nc.nextInt() - 1;

          System.out.println("Hey man your salary after taxes is: " + taxFee[job] * salary);
        }
    }
}