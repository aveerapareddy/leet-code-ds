package ArraysAndStrings.SlidingWindow;

//You are given an integer array nums consisting of n elements, and an integer k.

//  Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
public class MaximumAverageSubArray {

    // Input: nums = [1,12,-5,-6,50,3], k = 4
    //Output: 12.75000
    // Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    public static void main(String[] args) throws Exception {
        int[] nums = {5};
        int k = 1;
        double output = maximumAverageSubArray(nums, k);
        System.out.println("Maximum Average SubArray" + output);

    }

    private static double maximumAverageSubArray(int[] nums, int k) {
        int current = 0;
        double ans = 0.0;

        for (int i = 0; i < k; i++) {
            current += (nums[i]);
        }
        double maxAverage = (double) current / k;

        for (int i = k; i < nums.length; i++) {
            current += (nums[i] - nums[i - k]);
            double currentAverage = (double) current / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }
        return maxAverage;
    }
}
