package self;

public class assign17 {



        public static void main(String[] args) {
            // Example usage
            int[] array1 = {0, 1, 2, 3};
            int[] array2 = {0, 1, 3};

            System.out.println(isAllPossibilities(array1)); // Output: 1 (true)
            System.out.println(isAllPossibilities(array2)); // Output: 0 (false)
        }

        static int isAllPossibilities(int[] array) {
            int n = array.length;

            // Check if the array is non-empty
            if (n == 0) {
                return 0;
            }

            // Create a boolean array to mark the presence of numbers
            boolean[] presence = new boolean[n];

            // Iterate through the array elements
            for (int num : array) {
                // Check if the number is within the valid range
                if (num < 0 || num >= n) {
                    return 0;
                }

                // Check if the number is already present
                if (presence[num]) {
                    return 0;
                }

                // Mark the number as present
                presence[num] = true;
            }

            // Check if all numbers from 0 to n-1 are present
            for (boolean isPresent : presence) {
                if (!isPresent) {
                    return 0;
                }
            }

            // If all conditions are satisfied, the array is of all possibilities
            return 1;
        }
    }


