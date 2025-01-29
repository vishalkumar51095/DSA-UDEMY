import java.util.Arrays;

public class FirstTwoSum {
	public static void main(String[] args) {
		int nums [] = {10,1,11,15,24,15,67,34};
		int results [] = twoSum(nums,35 );
		System.out.println("Two Sums are:" + Arrays.toString(results));
	}
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
