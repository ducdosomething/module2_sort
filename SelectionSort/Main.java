package SelectionSort;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("The array before sort: ");
        displayArray(arr);

        selectionSort(arr);

        System.out.println("\nThe array before sort: ");
        displayArray(arr);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void displayArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
