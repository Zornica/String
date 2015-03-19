package com.example.introductionjava.string;

/**
 * Created by clouway on 2/26/15.
 */

/**
 * This class contains all different ways to generate a String
 */
public class StringGenerator {

  private static final int ECLAMATIONMARK = 33;
  private static final int TILDA = 126;

  /**
   * Generate a random string
   *
   * @param b int The length of the string
   * @return string String This is the final string that we've already generated.
   */
  public String randomValue(int b) {
    StringBuilder string = new StringBuilder("");
    for (int i = 1; i <= b; i++) {

      int s = (int) (Math.random() * (TILDA - ECLAMATIONMARK) + ECLAMATIONMARK);
      string.append((char) s);
    }
    return string.toString();
  }

}
