public abstract class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensuring age is positive
    }

    // Abstract method
    public abstract void makeSound();

    // Common method to all animals
    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }
}
