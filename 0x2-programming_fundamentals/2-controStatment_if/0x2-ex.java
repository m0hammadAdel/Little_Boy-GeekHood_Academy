import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        double[] gravity = {3.7, 8.87, 3.711, 24.79, 10.44, 8.69, 11.15};
        String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        System.out.print("Please enter your weight: ");
        double mass = nc.nextDouble()/9.81;

        for (int i = 0; i < planets.length; i++){
          System.out.print((i + 1) + "-" + planets[i] + " ");
        }

        System.out.println('.');

        System.out.print("Please select the number of the planet you want know what you weight on it");
        int planet = nc.nextInt() - 1;

        System.out.println("Your weight on the planet " + planets[planet] + " is: " + mass * gravity[planet]);
    }
}