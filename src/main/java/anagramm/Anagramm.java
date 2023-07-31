package anagramm;

import java.util.Arrays;

public class Anagramm {

  /**
    * @note: This function can be speed up by avoiding sorting. Sorting is
    * O(n * log(n)). Checking whether 2 strings are anagramms can be done in
    * O(n). This can by inserting the occurence of each character into a map,
    * incrementing for `str1` and subtracting for `str2`. At the end, when each
    * value in the map is 0, the 2 strings are anagramms.
    */
  public static boolean areAnagramms(String str1, String str2) {
      var chars1 = str1.toCharArray();
      var chars2 = str2.toCharArray();
      Arrays.sort(chars1);
      Arrays.sort(chars2);

      return Arrays.equals(chars1, chars2);
  }
}
