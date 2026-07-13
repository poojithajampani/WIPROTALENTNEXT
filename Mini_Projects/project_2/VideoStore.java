public class VideoStore {

    Video[] store = new Video[10];
    int count = 0;

    void addVideo(String name) {
        store[count++] = new Video(name);
        System.out.println("Video added successfully.");
    }

    void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].videoName.equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video checked out successfully.");
            }
        }
    }

    void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].videoName.equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video returned successfully.");
            }
        }
    }

    void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].videoName.equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating updated.");
            }
        }
    }

    void listInventory() {
        System.out.println("\nVideo Name\tCheckout\tRating");
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].videoName + "\t\t" + store[i].checkout + "\t\t" + store[i].rating);
        }
    }
}
