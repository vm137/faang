package interviews.one;

public class Application {

  public static void main(String[] args) {

    String str = "some text";

    char c = str.charAt(1);

    System.out.println(c);
  }

  public boolean isPalindrome(String input) {
    int p1 = 0, p2 = input.length() - 1;
    char c1, c2;

    // empty string check

    for (; ; ) {
      do {
        c1 = Character.toLowerCase(input.charAt(p1));
        p1++;
      } while (Character.isAlphabetic(c1));

      do {
        c2 = Character.toLowerCase(input.charAt(p2));
        p2--;
      } while (Character.isAlphabetic(c2));

      if (p2 - p1 >= 1) {
        return true;
      }

      if (c1 != c2) {
        return false;
      }

    }
  }
}
