public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser kid = new KidUser(10, "Kids");

        System.out.println("Kid User");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        AdultUser adult = new AdultUser(25, "Fiction");

        System.out.println("Adult User");
        adult.registerAccount();
        adult.requestBook();
    }
}