package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task4_DataTypeValidation3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isByte, which will return true if a string is 
         a valid integer of datatype byte
         Research Java byte 
        - what range of integers can it represent?
        - what are the storage requirements for a single byte?
        - when would you ever use byte rather than int?
        */
        
        String word = "127";
        boolean outcome = isByte(word);
        System.out.println(outcome);
    }

    private static boolean isByte(String word) {
        //this returns true if the string is all numbers
        /*we use two mechanisms
        1 - Byte.parseByte.  This will change a string "12.5" into 12.5 
        But it would fail/crash the program if it tried to change "12x" to a float,
        so we use
        2 - TRY/CATCH. This will allow us (the programmer to deal with the issue
        described above. Here we will return true if the parsing works, and 'catch' 
        the error by returning false.
        */ 

        try {
            Byte.parseByte(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
