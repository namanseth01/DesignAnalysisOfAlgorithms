package SearchingAlgorithms;

import SortingAlgorithms.SelectionSort;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int key)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        int[] numbers = new int[]{66, 55, 89, 12, 9, 3, 75};
        System.out.print("Given array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want to search for: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int result = search(numbers, key);
        if (result == -1) {
            System.out.println("!!!Element is not present");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
