package SortingAlgorithms;

public class CountingSort {

    void sort(int[] a)
    {
        int n = a.length;
        int[] output = new int [n+1];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] count = new int [max+1];

        for (int i = 0; i <= max; ++i)
        {
            count[i] = 0;
        }

        for (int i : a) {
            count[i]++;
        }

        for(int i = 1; i<=max; i++)
            count[i] += count[i-1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        for(int i = 0; i<n; i++) {
            a[i] = output[i];
        }
    }

    public static void main(String[] args)
    {
        CountingSort sort = new CountingSort();
        int[] numbers = new int[]{2,2,3,4,5,1,1,0,3,0,6,4};
        System.out.print("Given array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Sorted Array after applying Counting Sort: ");
        sort.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
