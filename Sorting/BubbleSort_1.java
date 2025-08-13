
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        bsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bsort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // when arr is sorted , and you don to swap anything for particular i

            if (!swapped) {
                break;
            }
        }
    }
}

// boolean swapppes ki waajh se sorted arr ki complexity O(n) ho jati hai O(n^2)
// se because vo phle hi terminate kr deta hai jab swap nhi milta
