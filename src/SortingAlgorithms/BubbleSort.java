package SortingAlgorithms;

public class BubbleSort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] numbers = new int[]{66, 55, 89, 12, 9, 3, 75};
        System.out.print("Given array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Sorted Array after applying Bubble Sort: ");
        sort.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
