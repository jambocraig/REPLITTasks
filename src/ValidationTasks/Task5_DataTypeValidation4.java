package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task5_DataTypeValidation4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isAlpha, which will return true if a string only 
        contains letters (upper or lower case)
        "test" is true
        "test1" is false
        "t e s t" is false
        "123" is false
        "CODE" is true
        */
        
        String word = "test";
        boolean outcome = isAlpha(word);
        System.out.println(outcome);
    }

    private static boolean isAlpha(String word) {
        /*
        we will use Character.isLetter to determine if each letter in the word is 
        a letter.
        if the for loop gets to the end return true, else false
        */
        
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }        
        return true;
    }
}
