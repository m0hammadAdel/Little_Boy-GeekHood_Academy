import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        String[] names = {"Ahmed", "Mohammad", "Asmaa", "Ehab", "Mahmoud", "Eslam"};
        String[] passwords = {"12345", "67890", "2468", "1357", "112233", "334455"};

        System.out.print("Please enter your name: ");
        String name = nc.nextLine();
        System.out.print("Please enter your password: ");
        String password = nc.nextLine();

        for(int i = 0; i < names.length; i++){
          if(name.equals(names[i]) && password.equals(passwords[i])){
            System.out.println("successful login.");
            break;
          }else if((name.equals(names[i]) && !password.equals(passwords[i])) || (!name.equals(names[i]) && password.equals(passwords[i]))){
            System.out.println("Invalid name or password!!");
            break;
          }

          if(i == names.length - 1){
            System.out.println("Sorry your not on the system try to sign up.");
          }
        }
    }
}