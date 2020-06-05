package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task0_LengthValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write a method called isMinLen8, which will return true if a string is 
        // at least 8 characters long
        String word = "test";
        boolean outcome = isMinLen8(word);
        System.out.println(outcome);
    }

    private static boolean isMinLen8(String word) {
        //this returns true if the length is greater than or equal to 8 (else false)
        return word.length() >= 8;
    }
}
