package chatGPT;

public class CoordinateGrid {
    public static void main(String[] args) {
        for (int x = 0; x <= 4; x++) {           // Outer loop for x
            for (int y = 0; y <= 4; y++) {       // Inner loop for y
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
