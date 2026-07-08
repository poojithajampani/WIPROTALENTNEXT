import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 34, 56, 7};

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        sc.close();
    }
}