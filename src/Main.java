import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 3, 7, 1, 2, 4, 3, 2, 1};
        System.out.println("Below is the array we have right now:\n" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length-1; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

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

        Arrays.sort(array);
        System.out.println("Sorted array: \n" + Arrays.toString(array));

    }
}