package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task1_LengthValidation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write a method called isInRange4_6, which will return true if a string is 
        // in the range 4 to 6 characters long (inclusive)
        String word = "test";
        boolean outcome = isInRange4_6(word);
        System.out.println(outcome);
    }

    private static boolean isInRange4_6(String word) {
        //this returns true if the length is in the range 4 to 6 characters 
        //long (inclusive) (else false)
        return word.length() >= 4 && word.length() <=6;
    }
}
