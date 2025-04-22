package claudeAI;

public class Counter {
    // Static variable shared by all instances
    private static int instantiationCounter = 0;

    // Constructor: called each time a new Counter is created
    public Counter() {
        instantiationCounter++;  // increment when object is created
    }

    // Static method to get the current count
    public static int getCount() {
        return instantiationCounter;
    }
}