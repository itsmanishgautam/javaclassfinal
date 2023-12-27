package self;

public class assign6 {

    public static int isBalanced(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                return 1; // Even index, but the element is not even
            } else if (i % 2 != 0 && array[i] % 2 == 0) {
                return 1; // Odd index, but the element is not odd
            }
        }
        return 0; // Array is balanced
    }



    public static void main(String[] args) {
        int[] array1 = {2, 1, 4, 3, 6};
        int[] array2 = {2, 4, 6, 8, 1, 3};

        System.out.println("Array 1 is balanced: " + isBalanced(array1));
        System.out.println("Array 2 is balanced: " + isBalanced(array2));
    }
   }

