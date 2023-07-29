import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.println("Please Enter your first name");
        String firstName = nc.nextLine();

        System.out.println("Please Enter your last name");
        String lastName = nc.nextLine();

        System.out.println("Please Enter your gender");
        String gender = nc.nextLine();

        System.out.println("Please Enter your age");
        int age = nc.nextInt();

        System.out.println("Please Enter your height in cm");
        int height = nc.nextInt();

        System.out.println("Please Enter your weight in kg");
        int weight = nc.nextInt();


        System.out.println("Hi " + firstName + ' ' + lastName + " you're a " + gender + " and you're " + height + "cm tall, and weight over " + weight + "kg in age of " + age + " years old.");
    }
}