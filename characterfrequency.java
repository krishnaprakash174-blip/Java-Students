public class characterfrequency {
  public static void main(String[] args) {
    String input = "programming";

    int[] freq = new int[256];

    for(int i = 0; i < input.length(); i++) {
      char currentchar = input.charAt(i);
      freq[currentchar]++;
    }

    System.out.println("Character frequencies in \"" + input + "\":");
    for(int i = 0; i < 256; i++) {
      if(freq[i] > 0) {
        System.out.println((char) i + " : " + freq[i]);
      }
    }
  }
}