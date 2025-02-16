package ArraysAndStrings.SlidingWindow;

//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
public class FindConsecutive1s {

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int output = findConsecutive1s(nums, k);
        System.out.println("Find Consecutive 1s " + output);

    }

    //SLIDING WINDOW
    //Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    //Output: 6
    //Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    //Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
    private static int findConsecutive1s(int[] nums, int k) {
        int answer = 0;
        int left = 0;
        int curr = 0; // current number of zeros in the window

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }
            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
