class Example1{
  public static void main(String[] args){
    int[] numbers = {6, 3 ,23, 64, 4, 2, 7, 8, 43, 233, 8};
    
    int sum = 0;
    for (int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }

    System.out.print("The Median for the list is: "+ sum/numbers.length);
  }
}