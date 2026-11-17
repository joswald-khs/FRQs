
/**
 * BingoCaller FRQ
 * 
 * In a game called Bingo, players mark off numbers on cards as the numbers are called randomly by a "caller." Each bingo card has 25 spaces arranged in a square of 5 rows and 5 columns. The columns are labeled from left to right with the letters "B", "I", "N", "G", "O".
 * The spaces in the card are assigned random values as follows:
 * Each space in the "B" column contains a number from 1 to 15, inclusive.
 * Each space in the "I" column contains a number from 16 to 30, inclusive.
 * Each space in the "N" column contains a number from 31 to 45, inclusive.
 * Each space in the "G" column contains a number from 46 to 60, inclusive.
 * Each space in the "O" column contains a number from 61 to 75, inclusive.
 * When a game of Bingo is played, each number can only be called once. A bingo call contains a column letter followed by a value (for example, "B7").

 *
 * @author Code.org
 * @version 2026.11.16
 */
public class BingoCaller {
  
  /** COLUMN_LETTERS[i] represents the letter located at a particular index value i */
  private static final String[] COLUMN_LETTERS = {"B", "I", "N", "G", "O"};

  /** numbersCalled[i] represents whether or not the value i+1 has been called */
  private static boolean[] numbersCalled = new boolean[75];

  /* Returns a boolean indicating whether a value has been called.
   * Precondition: numbersCalled contains 75 boolean values
   * Postcondition: numbersCalled is unchanged
   */
  public static boolean hasBeenCalled(int num) {
    if( num < 0 || num > 75 ) { return false; }
    return numbersCalled[num-1];
  }

  /* Returns a random value based on the given letter
   * Precondition: letter is not null or an empty string
   * Postcondition: random value is between 1-15 for the letter "B", 16-30 for the letter
   *                "I", 31-45 for the letter "N", 46-60 for the letter "G", or
   *                61-75 for the letter "O", inclusive
   */
  public static int getRandomNumber(String letter) {
    int r = ((int) (Math.random() * 15))+1;
    if( letter.equals("B") ) { return r + 0; }
    if( letter.equals("I") ) { return r + 15; }
    if( letter.equals("N") ) { return r + 30; }
    if( letter.equals("G") ) { return r + 45; }
    if( letter.equals("O") ) { return r + 60; }
    return r;
  }

  /* Returns a String containing the column letter and value
   * of a randomly generated bingo call.
   * Precondition: numbersCalled contains 75 boolean values
   * Postcondition: numbersCalled is updated to indicate that a value has been called
   */
  public static String makeCall() {
      int letterIndex = (int) (Math.random() * 5);
      int number = getRandomNumber(COLUMN_LETTERS[letterIndex]);  
      String call = COLUMN_LETTERS[letterIndex] + number;
      if( numbersCalled[number-1] ) {
          return call + " has already been called.";
      } else {
          numbersCalled[number-1] = true;
          return call;
      }
  }

  // There may be instance variables, constructors, and methods that are not shown.
}