public class Area {
    // Class fields
    private double length;
    private double width;

    // Constructor to initialize the fields
    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    // Method to output the area
    public void displayArea() {
        System.out.println("Area: " + calculateArea() + " square units");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of Area
        Area rectangle = new Area(30, 30);

        // Call the method to display the area
        rectangle.displayArea();
    }
}

