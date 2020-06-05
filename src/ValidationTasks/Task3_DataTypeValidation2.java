package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task3_DataTypeValidation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write a method called isFloat, which will return true if a string is 
        // a valid floating point number (Java Float)
        String word = "12x";
        boolean outcome = isFloat(word);
        System.out.println(outcome);
    }

    private static boolean isFloat(String word) {
        //this returns true if the string is all numbers
        /*we use two mechanisms
        1 - Float.parseFloat.  This will change a string "12.5" into 12.5 
        But it would fail/crash the program if it tried to change "12x" to a float,
        so we use
        2 - TRY/CATCH. This will allow us (the programmer to deal with the issue
        described above. Here we will return true if the parsing works, and 'catch' 
        the error by returning false.
        */ 

        try {
            Float.parseFloat(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
