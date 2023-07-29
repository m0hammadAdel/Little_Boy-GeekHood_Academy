import java.util.Scanner;

class Example4 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.print("Enter your weight on earth: ");
        double m = nc.nextDouble()/9.81;

        double[] gravity = {3.7, 8.87, 3.711, 24.79, 10.44, 8.69, 11.15};
        String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for (int i = 0; i < planets.length; i++){
          System.out.print("Your weight on " + planets[i] + " is: ");
          System.out.printf("%,.3f", (m*gravity[i]));
          System.out.println("kg");
        }

    }
}