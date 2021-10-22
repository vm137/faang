package strings.sortbyfreq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The
 * frequency of a character is the number of times it appears in the string.
 * <p>
 * Return the sorted string. If there are multiple answers, return any of them.
 * <p>
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class Application {

  public static void main(String[] args) {
    Application app = new Application();
    String resp = app.frequencySort("Tree sort. 55");

    System.out.println(resp);
  }

  public String frequencySort(String s) {
    s = s.toLowerCase();

    Map<Character, Integer> counts = new HashMap<>();
    for (char c : s.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        counts.put(c, counts.getOrDefault(c, 0) + 1);
      }
    }

    ArrayList<Character> characters = new ArrayList<>(counts.keySet());
    characters.sort((a, b) -> counts.get(b) - counts.get(a));

    StringBuilder sb = new StringBuilder();
    for (char c : characters) {
      int copies = counts.get(c);
      for (int i = 0; i < copies; i++) {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
