import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        Scanner genScn = new Scanner(System.in);

        System.out.println("please Enter your name: ");
        String name = nc.nextLine();

        System.out.println("please Enter your age: ");
        int age = nc.nextInt();

        System.out.println("please Enter your gender: ");
        String gender = genScn.nextLine();

        System.out.println("Hi "+ name + " your age is: " + age + " and you are a " + gender + '.');
    }
}