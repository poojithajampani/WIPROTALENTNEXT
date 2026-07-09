class Animal {

    // Method to eat
    public void eat() {
        System.out.println("Animal is eating.");
    }

    // Method to sleep
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {

    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    // Overriding sleep() method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping.");
    }

    // New method
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {

        // Animal object
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println();

        // Bird object
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
