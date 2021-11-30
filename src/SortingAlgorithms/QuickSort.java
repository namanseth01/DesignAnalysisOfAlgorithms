package SortingAlgorithms;

public class QuickSort {


    static void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int index = partition(arr, low, high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }
    }
}
