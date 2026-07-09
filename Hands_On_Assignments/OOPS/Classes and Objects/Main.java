// Box class
class Box {
    double width, height, depth;

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Box object
        Box box1 = new Box(5, 4, 3);

        // Display dimensions
        System.out.println("Width  : " + box1.width);
        System.out.println("Height : " + box1.height);
        System.out.println("Depth  : " + box1.depth);

        // Display volume
        System.out.println("Volume of the box = " + box1.getVolume());
    }
}