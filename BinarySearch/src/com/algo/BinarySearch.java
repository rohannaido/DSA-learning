package com.algo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1,3,5,6,11,16,26,27,44,76,87};
        int target = 41;

        System.out.print(binarySearch(list, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (end >= start) {

            // middle element int he array
            mid = start + (end - start)/2;

            // comparing elements
            // if target is less than the middle element then start searching in the left side of the array.
            if(target < arr[mid]) {
                end = mid - 1;
            }
            // if target is greater than the middle element then search in the right side of the array.
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        // if target is not found ; return -1;
        return -1;
    }
}
