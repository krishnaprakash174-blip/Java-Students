public class missingnumber {
  public static int findmissingnumber(int[] arr, int n) {
    long expectedSum = (long) n * (n+1) / 2;
    
    long actualSum = 0;
    for(int num : arr) {
      actualSum += num;
    }

    return (int) (expectedSum - actualSum);
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 5, 6};
    int n = 6;

    int missing = findmissingnumber(numbers, n);
    System.out.println("The missing number is: " + missing);
  }
}