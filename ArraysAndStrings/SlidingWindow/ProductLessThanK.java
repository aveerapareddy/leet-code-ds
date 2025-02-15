package ArraysAndStrings.SlidingWindow;

public class ProductLessThanK {

    public static void main(String[] args) throws java.lang.Exception {
        int[] input = {10, 5, 2, 6};
        int k = 100;
        int output = numSubarrayProductLessThanK(input, k);
        System.out.println("Num Subarray Product Less Than K" + output);

    }

    private static int numSubarrayProductLessThanK(int[] input, int k) {
        int left = 0;
        int curr = 1;
        int ans = 0;
        if (k <= 1) {
            return 0;
        }

        for (int right = 0; right < input.length; right++) {
            curr *= input[right];

            while (curr >= k) {
                curr /= input[left];
                left++;
            }
            ans += right - left + 1;

        }

        return ans;
    }
}
