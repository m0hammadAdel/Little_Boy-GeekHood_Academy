class Example1{
  public static void main(String[] args){
    int[] numbers = {6, 3 ,23, 64, 4, 2, 7, 8, 43, 233, 8};
    int counter = 0;

    // counting the odd numbers
    for (int i = 0; i < numbers.length; i++){
      if(numbers[i] % 2 != 0){
        counter ++;
      }
    }

    int[] oddNums = new int[counter]; //make an array with exact number of od numbers
    counter = 0; //reuse the counter again

    // the actual magic goes here
    for (int i = 0; i < numbers.length; i++){
      if(numbers[i] % 2 != 0){
        oddNums[counter] = numbers[i];
        counter ++;
      }
    }

    for (int i = 0; i < oddNums.length; i++){
      System.out.print(oddNums[i] + ", ");
    }
  }
}