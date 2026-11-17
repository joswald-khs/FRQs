
/**
 * Write a description of class InClassBingoCaller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InClassBingoCaller
{ 
  /** COLUMN_LETTERS[i] represents the letter located at a particular index value i */
  private static final String[] COLUMN_LETTERS = {"B", "I", "N", "G", "O"};

  /** numbersCalled[i] represents whether or not the value i+1 has been called */
  private boolean[] numbersCalled;
  
  public InClassBingoCaller() {
      numbersCalled = new boolean[75];
  }

  /* Returns a boolean indicating whether a value has been called.
   * Precondition: numbersCalled contains 75 boolean values
   * Postcondition: numbersCalled is unchanged
   */
  private boolean hasBeenCalled(int num) {
    if( num < 0 || num > numbersCalled.length - 1 )  { 
        throw new IllegalArgumentException(num + " is not a valid bing number");
    } 
    return numbersCalled[num];
  }

  /* Returns a random value based on the given letter
   * Precondition: letter is not null or an empty string
   * Postcondition: random value is between 1-15 for the letter "B", 16-30 for the letter
   *                "I", 31-45 for the letter "N", 46-60 for the letter "G", or
   *                61-75 for the letter "O", inclusive
   */
  private int getRandomNumber(String letter) {
    return (int) (Math.random() * numbersCalled.length);
  }

  /* Returns a String containing the column letter and value
   * of a randomly generated bingo call.
   * Precondition: numbersCalled contains 75 boolean values
   * Postcondition: numbersCalled is updated to indicate that a value has been called
   */
  public String makeCall() {
    int generatedCallNumber = getRandomNumber("");
    // we don't want to make a duplicate call.
    while( hasBeenCalled(generatedCallNumber) ) {
        generatedCallNumber = getRandomNumber("");
    }
    numbersCalled[generatedCallNumber] = true; 
    return convertNumberToString(generatedCallNumber) + (generatedCallNumber+1); 
  }
  
  private String convertNumberToString(int n) {
      return COLUMN_LETTERS[n/15];
      // if( n >= 0 && n < 15 ) { return "B"; }
      //...
  }

  // There may be instance variables, constructors, and methods that are not shown.
}

