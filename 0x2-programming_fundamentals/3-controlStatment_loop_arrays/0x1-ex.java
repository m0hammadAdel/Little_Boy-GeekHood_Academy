import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        String names[] = new String[10];

        System.out.println("Please enter 10 names.");

        for (int i = 0; i < names.length; i++){
          System.out.print("Enter name: ");
          names[i] = nc.nextLine();
        }

        for (int i = 0; i < names.length; i++){
          if(i == names.length -1){
            System.out.print(names[i] + ".");
          }else{
            System.out.print(names[i] + ", ");
          }
        }

    }
}