package SortingAlgorithms;

public class SelectionSort {

    void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        SelectionSort sort = new SelectionSort();
        int[] numbers = new int[]{66, 55, 89, 12, 9, 3, 75};
        System.out.print("Given array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Sorted Array after applying Selection Sort: ");
        sort.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
