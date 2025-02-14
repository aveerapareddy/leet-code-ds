package ArraysAndStrings.SlidingWindow;

//Example 1: Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
public class FindLegthOfSubArray {

    public static void main(String[] args) throws java.lang.Exception {
        int[] input = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int target = 8;
        int output = findLength(input, target);
        System.out.println("Longest SubString Length " + output);

    }

    private static int findLength(int[] input, int target) {
        int answer = 0;
        int left = 0;
        int curr = 0; // current some of the window

        for (int right = 0; right < input.length; right++) {
            curr += input[right];
            while (curr > target) {
                curr -= input[left];
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
