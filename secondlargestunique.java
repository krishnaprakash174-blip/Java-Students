public class secondlargestunique {
  public static Integer findsecondlargest(int[] arr) {
    if(arr == null || arr.length < 2) {
      return null;
    }

    Integer largest = null;
    Integer secondlargest = null;

    for(int num : arr) {
      if((largest != null && num == largest) || (secondlargest != null && num == secondlargest)) {
        continue;
      }

      if(largest == null || num > largest) {
        secondlargest = largest;
        largest = num;
      } else if(secondlargest == null || num > secondlargest) {
        secondlargest = num;
      }
    }
    return secondlargest;
  }

  public static void main(String[] args) {
    int[] numbers1 = {12, 35, 1, 10, 34, 1, 35};
    int[] numbers2 = {10, 10, 10};
    int[] numbers3 = {-5, -2, -10, -2, -1};

    printResult(numbers1);
    printResult(numbers2);
    printResult(numbers3);
  }

  private static void printResult(int[] arr) {
    Integer result = findsecondlargest(arr);
    if(result != null) {
      System.out.println("Second-largest unique element: " + result);
    } else {
      System.out.println("No second-largest unique element exists.");
    }
  }
}