
/*
 * Duplicate Number
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
 */

import java.util.Arrays;

public class DuplicateNumber {
	public static void main(String[] args) {
		int array[]={1, 1, 2, 2, 3, 4, 5};
		int result []=removeDuplicates(array);
		System.out.println("After Removed Array:"+ Arrays.toString(result));
	}
	 public static int[] removeDuplicates(int[] array) {
	        int n = array.length;
	        int[] uniqueArray = new int[n];
	        int index = 0;
	 
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = i + 1; j < n; j++) {
	                if (array[i] == array[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                uniqueArray[index++] = array[i];
	            }
	        }
	 
	        return Arrays.copyOf(uniqueArray, index);
	    }
}
