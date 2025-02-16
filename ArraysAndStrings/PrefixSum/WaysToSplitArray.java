package ArraysAndStrings.PrefixSum;

public class WaysToSplitArray {

    public static void main(String[] args) throws java.lang.Exception {
        int[] nums = {0, 0};
        int ans = waysToSplitArray(nums);
        System.out.println("Way to Split Array " + ans);

    }

    private static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[n - 1] - prefix[i];
            if (leftSection > rightSection) {
                ans++;
            }
        }
        return ans;
    }
}
