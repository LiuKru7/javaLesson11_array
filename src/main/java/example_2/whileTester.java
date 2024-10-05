package example_2;

public class whileTester {
    public static void main(String[] args) {
        boolean spinCycle = true ;
        int counter = 0;
        while (spinCycle) {
            System.out.println("Printing while boolean is true");
            counter ++;
            if (counter == 5) {
                spinCycle = false;
            }
        }

    }
}
