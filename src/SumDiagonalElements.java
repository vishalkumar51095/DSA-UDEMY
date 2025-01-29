
public class SumDiagonalElements {
	public static void main(String[] args) {
		   // Initialize a 2D array for testing
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate and print the sum of diagonal elements
        int sum = sumDiagonalElements(array);
        System.out.println("Sum of diagonal elements: " + sum);
	}
	  public static int sumDiagonalElements(int[][] array) {
	        int sum = 0;
	        int numRows = array.length;
	 
	        for (int i = 0; i < numRows; i++) {
	            sum += array[i][i];
	        }
	 
	        return sum;
	    }
}
