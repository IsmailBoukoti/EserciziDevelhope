/**
 * A class created for some word games using strings
 * @author Ismail Boukoti
 */

public class WordGames {

    /**
     * This method takes an input as string
     * Then it returns the string "Hello" followed by the input as concatenation of strings
     * @param word The user input as String
     * @return Concatenation of "Hello" and input
     */
       public String   addHelloWord (String word){
            return "Hello " + word ;
        }

    /**
     * This method takes 2 inputs as strings
     * Then it returns them as a concatenation of strings
     * @param name User inputs name as string
     * @param surname User inputs surname as string
     * @return Concatenation of name and surname
     */
       public String getFullName (String name, String surname){
           return name + surname;
       }
    }

