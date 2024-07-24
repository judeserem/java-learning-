public class Animal {
    // Class fields
    private String animalName;
    private double animalWeight;

    // Constructor to initialize the fields
    public Animal(String name, double weight) {
        this.animalName = name;
        this.animalWeight = weight;
    }

    // Method to output the name and weight of the animal
    public void displayInfo() {
        System.out.println("Animal Name: " + animalName);
        System.out.println("Animal Weight: " + animalWeight + " kg");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal lion = new Animal("Lion", 190.5);
        
        // Call the method to display the information
        lion.displayInfo();
    }
}

