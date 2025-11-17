public class LinearSearch {
    /** 
     * Searches for target in array arr.
     * @param arr the array to search
     * @param target the value to find
     * @return index of target if found, otherwise –1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 35, 63, 96, 57 };
        int target = 63;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
