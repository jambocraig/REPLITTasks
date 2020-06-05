package ValidationTasks;


/**
 *
 * @author craigmurray
 */
public class Task9_FormatValidation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isValidEmail which will return true if the string
        is in the format ALL STRING + "@ttsonline.net"      
         */

        String email = "a@ttsonline.net";
        boolean outcome = isValidEmail(email);
        System.out.println(outcome);
    }

    private static boolean isValidEmail(String email) {
        //check the minimum length
        if(email.length() < 15) return false;
        //check the ending
        if(!email.endsWith("@ttsonline.net")) return false;
        //check the front characters are all letters - using isAlpha
        return isAlpha(email.substring(0, email.length() - 14));        
    }

    private static boolean isAlpha(String front) {
        for (int i = 0; i < front.length(); i++) {
            if (!Character.isLetter(front.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
