import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        
        System.out.print("please insert day: ");
        int day = nc.nextInt();

        System.out.print("please insert month: ");
        int month = nc.nextInt();

        System.out.print("please insert year: ");
        int year = nc.nextInt();

        int curDay = 28;
        int curMonth = 7;
        int curYear = 2032;

      if(curDay - day < 0){
        month--;
        day += 30;
      }
      int resultDay = curDay - day;
      System.out.println(resultDay);
      if(curMonth - month < 0){
        year--;
        day += 12;
      }
      int resultMonth = curMonth - month;
      System.out.println(resultMonth);
      int resultYear = curYear - year;
      System.out.println(resultYear);
    }
}