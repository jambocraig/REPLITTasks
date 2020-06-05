package ValidationTasks;

/**
 *
 * @author craigmurray
 */
public class Task6_RangeValidation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* write a method called isInRange1_100
        which will take an integer and return true if it is in range 1 - 100 (inc)
        */
        
        int age = 12;
        boolean outcome = isInRange1_100(age);
        System.out.println(outcome);
    }

    private static boolean isInRange1_100(int age) {
        return age >= 1 && age <= 100;        
    }
}
