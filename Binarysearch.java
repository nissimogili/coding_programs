public class BinarySearchIterative {

    /** 
     * Returns the index of target in array `arr` if present, otherwise returns –1.
     * Assumes `arr` is sorted in ascending order.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // avoid potential overflow: mid = left + (right‐left)/2
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // if we reach here, target was not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;

        int result = binarySearch(arr, target);
        System.out.println("Element to be searched is : " + target);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
