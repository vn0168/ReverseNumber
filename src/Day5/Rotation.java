package Day5;
import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateLeft(arr, x);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;

        reverseArray(arr, 0, x - 1);


        reverseArray(arr, x, n - 1);

        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }
}
