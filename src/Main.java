import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Method multiply array that multiplies the array with whatever value the user chose
    static void multiplyArray(int[] args, int value) {
        System.out.print("Under construction");
    }

    public static void main(String[] args) {

        int[] array = {5, 3, 7, 1, 2, 4, 3, 2, 1};
        int count = 0;
        System.out.println("Below is the array we have right now:\n" + Arrays.toString(array));

        // Manual Sort
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length-1; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.print("Here is the sorted array using manual sort: \n");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]\n");

        // Sort using the library
        int[] array2 = {5, 3, 7, 1, 2, 4, 3, 2, 1};
        Arrays.sort(array2);
        System.out.println("Sorted array: \n" + Arrays.toString(array2));

        // Create a scanner object
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("\nDo you want to multiply the array? [Y/N] ");

        while (true) {
            String choice = scannerObject.nextLine();
            // Check if user enters Y or N
            if (choice.toUpperCase().equals("Y")) {
                System.out.print("Enter a value: ");
                int value = scannerObject.nextInt();
                multiplyArray(array, value);
                break;
            } else if (choice.toUpperCase().equals("N")) {
                System.out.print("Okey dokey.\n");
                break;
            } else {
                count++;
                // If user enters a wrong input every 3 times, display this message
                if (count % 3 == 0) {
                    System.out.print("All you have to do is enter the letter 'y' or 'n'. Try again: ");
                } else {
                    // Humorous quote from 'The Office' sitcom
                    System.out.print("I SAID YES (Y) OR NO (N). DID I STUTTER? ");
                }
            }
        }
    }
}