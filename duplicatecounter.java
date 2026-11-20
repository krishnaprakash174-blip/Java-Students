import java.util.LinkedHashMap;
import java.util.Map;

public class duplicatecounter {
  public static void main(String[] args) {
    int[] numbers = {4, 2, 7, 4, 8, 2, 4, 9, 7, 1};

    findAndCountDuplicates(numbers);
  }

  public static void findAndCountDuplicates(int[] arr) {
    Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

    for(int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    System.out.println("Duplicate elements and their counts:");
    boolean hasDuplicates = false;

    for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println("Element: " + entry.getKey() + " | Count: " + entry.getValue());
        hasDuplicates = true;
      }
    }

    if(!hasDuplicates) {
      System.out.println("No duplicate elements found.");
    }
  }
}