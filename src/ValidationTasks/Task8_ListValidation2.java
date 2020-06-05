package ValidationTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/**
 *
 * @author craigmurray
 */
public class Task8_ListValidation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isMemberType which will return true if the string
        is either "Full", "Child", or "OAP"       
         */

        String word = "Full";
        boolean outcome = isMemberType(word);
        System.out.println(outcome);
    }

    private static boolean isMemberType(String word) {
        final ArrayList<String> MEMBER_TYPES = new ArrayList<String>(Arrays.asList(
                "Full", "Child", "OAP"));
        return MEMBER_TYPES.contains(word);
    }

}
