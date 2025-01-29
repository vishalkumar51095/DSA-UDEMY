
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,5,6,7,8};
		
		linearSearch(arr, 3);
	}
	
	public static void linearSearch(int arr[],int value) {
				
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				System.out.println("Value is found at the position at:"+ i); 
				return;
			}
		}
		
		System.out.println("Value is not Found.");
	}
	
}
