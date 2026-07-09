class Fruit {
    String name;
    String taste;
    String size;

    // Parameterized Constructor
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit
    public void eat() {
        System.out.println("Fruit: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {

    Apple(String size) {
        super("Apple", "Sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Orange extends Fruit {

    Orange(String size) {
        super("Orange", "Sour", size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit: " + name);
        System.out.println("Taste: " + taste);
    }
}

public class FruitDemo {
    public static void main(String[] args) {

        Apple apple = new Apple("Medium");
        Orange orange = new Orange("Large");

        apple.eat();
        System.out.println();

        orange.eat();
    }
}
