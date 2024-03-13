public class SumDivisibleBy5And2 {

  public static void main(String[] args) {
    int[] values = {100, 52, 43, 99, 42, 40, 91};
    int sum = findSumDivisibleBy5And2(values);
    System.out.println("The sum of numbers divisible by both 5 and 2 is: " + sum);
  }

  public static int findSumDivisibleBy5And2(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      // Check if the number is divisible by both 5 and 2 (divisible by their LCM)
      if (num % 10 == 0) {
        sum += num;
      }
    }
    return sum;
  }
}