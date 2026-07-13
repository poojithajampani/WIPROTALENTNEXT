import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();

        int choice;

        do {

            System.out.println("\n1.Add Video");
            System.out.println("2.Check Out");
            System.out.println("3.Return Video");
            System.out.println("4.Receive Rating");
            System.out.println("5.List Inventory");
            System.out.println("6.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Video Name: ");
                    vs.addVideo(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Video Name: ");
                    vs.doCheckout(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Video Name: ");
                    vs.doReturn(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter Video Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Rating: ");
                    int rating = sc.nextInt();
                    vs.receiveRating(name, rating);
                    break;

                case 5:
                    vs.listInventory();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
