public class Subtraction {

    // Method to subtract two numbers and print the result
    public void subtractNumbers(int a, int b) {
        int result = a - b;
        System.out.println("The result of " + a + " - " + b + " is: " + result);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of Subtraction
        Subtraction subtraction = new Subtraction();

        // Call the method to subtract the numbers
        subtraction.subtractNumbers(120, 100);
    }
}
