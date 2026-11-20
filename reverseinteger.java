public class reverseinteger {
  public static int reverse(int num) {
    int reversed = 0;

    while (num != 0) {
      int lastDigit = num % 10;

      if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
          return 0;
      }
      
      if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit > -8)) {
          return 0;
      }

      reversed = (reversed * 10) + lastDigit;

      num = num / 10;
    }

    return reversed;
  }
  public static void main(String[] args) {
    int positiveNum = 12345;
    int negativeNum = -9876;

    System.out.println("Original: " + positiveNum + " | Reversed: " + reverse(positiveNum));
    System.out.println("Original: " + negativeNum + " | Reversed: " + reverse(negativeNum));
  }
}