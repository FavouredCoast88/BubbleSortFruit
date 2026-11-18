
package bubblesortfruit;

public class BubbleSortFruit {    
    
      // Method to display array elements
    public static void displayArray(String[] arr) {
        for (String fruit : arr) {
            System.out.print(fruit + " ");
        }//end for
    }//end display array method
    
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Mango", "Banana"};
         // Display before sorting
        System.out.println("Before Sorting:");
        displayArray(fruits);

        // Sort using bubble sort
        bubbleSort(fruits);

        // Display after sorting
        System.out.println();
        System.out.println("\nAfter Sorting:");
        displayArray(fruits);
    }//end main
    
    // Bubble sort method for strings
    public static void bubbleSort(String[] arr) {
        int f = arr.length;
        boolean swapped; //Used to track swaps

        for (int i = 0; i < f - 1; i++) {
            swapped = false;
            for (int j = 0; j < f - i - 1; j++) {
                // Compare ignoring case for alphabetical order
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    // Swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }//end if
            }//end for
            // Optimization: stop if no swaps occurred
            if (!swapped) break;
        }//end for
    }//end bubblesort method
}//end class
//Using for loops for bubble sort and insertion uses nested while loops