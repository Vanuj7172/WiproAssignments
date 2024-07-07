//Q1) : Circular Queue Binary Search
//Consider a circular queue (implemented using a fixed-size array) where the elements are sorted but have been rotated at an unknown index. Describe an approach to perform a binary search for a given element within this circular queue.
//
//

package day6;

public class CircularQueueBinarySearch {

    // method to find the rotation point
    public static int findRotationPoint(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // method to determine the search range
    public static int[] searchRange(int[] arr, int target) {
        int rotationPoint = findRotationPoint(arr);
        int low = 0;
        int high = arr.length - 1;

        if (target >= arr[rotationPoint] && target <= arr[high]) {
            low = rotationPoint;
        } else {
            high = rotationPoint - 1;
        }

        return new int[]{low, high};
    }

    // method to perform the binary search
    public static int circularQueueBinarySearch(int[] arr, int target) {
        int[] range = searchRange(arr, target);
        int low = range[0];
        int high = range[1];

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }

    
    
    //main method
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 6;
        int index = circularQueueBinarySearch(arr, target);
        System.out.println("Target " + target + " found at index: " + index);
    }
}



