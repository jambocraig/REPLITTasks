package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task2_DataTypeValidation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write a method called isInteger, which will return true if a string is 
        // all numbers
        String word = "12u";
        boolean outcome = isInteger(word);
        System.out.println(outcome);
    }

    private static boolean isInteger(String word) {
        //this returns true if the string is all numbers
        /*we use two mechanisms
        1 - Integer.parseInt.  This will change a string "12" into 12
        But it would fail/crash the program if it tried to change "hi" to an int,
        so we use
        2 - TRY/CATCH. This will allow us (the programmer to deal with the issue
        described above. Here we will return true if the parsing works, and 'catch' 
        the error by returning false.
        */ 
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
