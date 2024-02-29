public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.displayInfo(); // Displays: Name: Buddy, Age: 3, Breed: Golden Retriever
        myDog.makeSound(); // Displays: Buddy says: Woof!
    }
}