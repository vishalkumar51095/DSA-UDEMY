import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {10, 1, 11, 15, 24, 15, 67, 34};
        int target = 35;

        List<int[]> results = twoSum(nums, target);
        
        if (results.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs with sum " + target + ":");
            for (int[] pair : results) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }

    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{nums[i], nums[j]}); // Store the pair
                }
            }
        }

        return result; // Return all pairs found
    }
}
