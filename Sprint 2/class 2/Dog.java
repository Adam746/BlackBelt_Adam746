public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    // Getter and Setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Implementing the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Overriding the displayInfo method to include breed
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + getBreed());
    }
}
