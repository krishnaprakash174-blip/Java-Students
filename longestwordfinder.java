import java.util.Scanner;

public class longestwordfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String longestWord = findLongestWord(sentence);
        
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
        
        scanner.close();
    }

    public static String findLongestWord(String str) {
        String longestWord = "";
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (Character.isLetterOrDigit(ch)) {
                currentWord.append(ch);
            } else {
                
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                
                currentWord.setLength(0);
            }
        }

        
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord.toString();
        }

        return longestWord;
    }
}
