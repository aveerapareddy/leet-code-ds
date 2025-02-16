package ArraysAndStrings.PrefixSum;

public class RunningSum {

    //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    //Return the running sum of nums.
    public static void main(String[] args) throws Exception {
        int[] nums = {0, 0};
        int[] ans = runningSum(nums);
        System.out.println("Running Sum" + ans);

    }

    private static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
