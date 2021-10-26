package interviews.ynd.one;

public class IsPalindrome {

  /**
   * Казак
   * А роза упала на лапу Азора
   * Do geese see God?
   * Madam, I’m Adam
   *
   * Ограничение по памяти O(1)
   */
  public boolean isPalindrome(String input) {
    int p1 = 0, p2 = input.length();
    char c1, c2;

    // empty string check

    for(;;) {
      do {
        c1 = Character.toLowerCase(input.charAt(p1));
        p1++;
      } while (Character.isAlphabetic(c1));


      do {
        c2 = Character.toLowerCase(input.charAt(p2));
        p2--;
      } while (Character.isAlphabetic(c2));

      if (p2 - p1 >= 1)    {
        return true;
      }

      if (c1 != c2) { return false; }

    }

//    return true;
  }
}
