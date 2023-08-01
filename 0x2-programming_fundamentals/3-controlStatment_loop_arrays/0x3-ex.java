class Example1{
  public static void main(String[] args){
    int[] numbers = {6, 3 ,23, 64, 4, 2, 7, 8, 43, 233, 8};

    for (int i = 0; i < numbers.length; i++){
      for (int j = i + 1; j < numbers.length; j++){
        int temp = numbers[i];
        if (numbers[i] > numbers[j]){
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }

    for (int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + ", ");
    }
  }
}