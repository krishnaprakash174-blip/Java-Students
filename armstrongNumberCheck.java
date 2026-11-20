import java.util.Scanner;

public class armstrongNumberCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();

    if(isArmstrong(number)) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }

  public static boolean isArmstrong(int num) {
    if(num < 0) {
      return false;
    }

    int originalNum = num;
    int digits = 0;
    int temp = num;

    if(temp == 0) {
      digits = 1;
    } else {
      while (temp > 0) {
        digits++;
        temp /= 10;
      }
    }

    int sum = 0;
    temp = num;

    while(temp > 0) {
      int lastDigit = temp % 10;
      sum += power(lastDigit, digits);
      temp /= 10;
    }

    return sum == originalNum;
  }

  public static int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result; 
  }
}