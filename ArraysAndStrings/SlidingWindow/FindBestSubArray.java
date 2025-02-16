package ArraysAndStrings.SlidingWindow;

//Example 1: Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
public class FindBestSubArray {

    public static void main(String[] args) throws Exception {
        int[] nums = {3, -1, 4, 12, -8, 5, 6};
        int k = 4;
        int output = FindBestSubArray(nums, k);
        System.out.println("Best Sub Array " + output);

    }

    private static int FindBestSubArray(int[] nums, int k) {
        int curr = 0;

        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
