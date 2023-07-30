import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        Scanner nc1 = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = nc.nextLine();

        System.out.print("Please enter your age: ");
        int age = nc1.nextInt();

        System.out.print("Please enter your gender: ");
        String gender = nc.nextLine();

        if(age < 25 || age > 60){
          System.out.println("Hey " + name + " we sorry we can't accept you with us.");
        } else {
          System.out.println("Hey " + name + " welcome on board.");
        }
    }
}