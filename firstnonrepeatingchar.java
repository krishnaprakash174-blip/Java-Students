public class firstnonrepeatingchar {
  public static char findfirstnonrepeating(String str) {
    int[] charcounts = new int[256];

    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      charcounts[ch]++;
    }

    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if(charcounts[ch] == 1) {
        return ch;
      }
    }

    return '\0';
  }

  public static void main(String[] args) {
    String input = "swiss";
    char result = findfirstnonrepeating(input);

    if(result != '\0') {
      System.out.println("First non-repeating character: " + result);
    } else {
      System.out.println("No non-repeating character found.");
    }
  }
}