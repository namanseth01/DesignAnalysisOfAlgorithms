package SortingAlgorithms;

public class QuickSort {
    public int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        int temp;
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    public void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int index = partition(arr, low, high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }
    }

    public static void main(String[] args)
    {
        QuickSort sort = new QuickSort();
        int[] numbers = new int[]{66, 55, 89, 12, 9, 3, 75};
        System.out.print("Given array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Sorted Array after applying Quick Sort: ");
        sort.sort(numbers, 0 , numbers.length - 1);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
