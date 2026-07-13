public class Video {

    String videoName;
    boolean checkout;
    int rating;

    Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    void doCheckout() {
        checkout = true;
    }

    void doReturn() {
        checkout = false;
    }

    void receiveRating(int r) {
        rating = r;
    }
}