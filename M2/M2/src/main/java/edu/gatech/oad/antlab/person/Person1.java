package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	
	  // If string is less than 3 characters
	  // then rotation doesn't mean anything
	  if(input.length() < 3)
        return input;
	  	
	  // Strings are immutable and I don't want to 
	  // import StringBuilder, so we will inefficiently 
	  // re-copy to build up this string
	  String input_Adj = "";
	  for(int i = 2; i < input.length(); i++) {
		input_Adj += input.charAt(i);  
	  }
	  for(int i = 0; i < 2; i++) {
	  	input_Adj += input.charAt(i);
	  }
	  return input_Adj;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
