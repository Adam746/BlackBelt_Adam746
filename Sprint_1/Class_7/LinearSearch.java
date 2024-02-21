public class LinearSearch {

    /**
     * Performs a linear search on the given array.
     * 
     * @param arr The array to search through.
     * @param target The value to search for.
     * @return The index of the target value if found; otherwise, -1.
     */
    public static int linearSearch(int[] arr, int target) {
        // Loop through all elements in the array.
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target value.
            if (arr[i] == target) {
                // If a match is found, return the current index.
                return i;
            }
        }
        // If no match is found by the end of the loop, return -1.
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 45, 1, 2, 99, -5, 46, 1012, 56, 8};
        int target = 99;
        int resultIndex = linearSearch(numbers, target);

        if (resultIndex != -1) {        // != is 'not equal'
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
