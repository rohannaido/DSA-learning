package com.algo;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }
    static int ceilingNumber(int[] arr, int target) {
        // if return if target present in the array
        // or the smallest greatest number than the target in the array

        // same code as binary search ONLY instead of return -1 when target not found we will return start
        // as when the while loop breaks the start is greater than end. -> start will become the answer.

        // doubt - the final middle element will always be less than the target.
        // that will be the case bcoz??

        int mid = 0;
        int start = 0;
        int end = arr.length;

        while (end >= start) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
