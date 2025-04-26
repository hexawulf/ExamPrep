package claudeAI2;

public class Q19
{
    public static void main(String[] args)
    {
        try {
            System.out.println(validateAge(25));    // Should print 25
            System.out.println(validateAge(-5));    // Should throw exception and print message
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    } // end of psvm

    public static int validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age > 120) {
            throw new InvalidAgeException("Age cannot be greater than 120.");
        }
        return age;
    }
// end of validateAge

} // end of class
