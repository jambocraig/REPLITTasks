package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task10_FormatValidation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isValidEmail2 which will return true if the string
        is in the format INT INT then ALL STRING + "@ttsonline.net"      
        
        the integer represents the year that students joined school
        Values greater than 21 and less than 85 are NOT ACCEPTABLE
         */

        String email = "29cf@ttsonline.net";
        boolean outcome = isValidEmail(email);
        System.out.println(outcome);
    }

    private static boolean isValidEmail(String email) {
        //check the minimum length
        if(email.length() < 17) return false;
        //check the ending
        if(!email.endsWith("@ttsonline.net")) return false;
        //check the front characters are all letters - using isAlpha
        return isInt(email.substring(0, 2)) && 
                isAlpha(email.substring(2, email.length() - 14));        
    }

    private static boolean isAlpha(String front) {
        for (int i = 0; i < front.length(); i++) {
            if (!Character.isLetter(front.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInt(String year) {
        int y;
        try {
            y = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            return false;
        }
        if (y > 21 && y < 85) {
            return false;
        }
        return true;
    }
}
