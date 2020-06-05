package ValidationTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/**
 *
 * @author craigmurray
 */
public class Task7_ListValidation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isMonth and will return true if the string is a 
        valid month,
        Here we will consider a valid month to be "January" etc (that is, upper case 
        first letter and remainder are lower case)
         */

        String word = "december";
        boolean outcome = isMonth(word);
        System.out.println(outcome);
    }

    private static boolean isMonth(String word) {
        final ArrayList<String> MONTHS = new ArrayList<String>(Arrays.asList("January", 
                "February", "March", "April", "May", "June", "July", "August", 
                "September", "October", "November", "December"));
        return MONTHS.contains(word);
    }

}
