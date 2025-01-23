import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<ArrayList<Integer>> combinationsWithDuplicates(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        helper(nums, k, 0, res, temp);
        return res;
    }

    private static void helper(int[] nums, int k, int start, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp) {
        if (k == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; ++i) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            helper(nums, k - 1, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int k = 2;
        ArrayList<ArrayList<Integer>> result = combinationsWithDuplicates(nums, k);
        for (ArrayList<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
