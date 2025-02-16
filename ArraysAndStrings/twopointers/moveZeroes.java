package ArraysAndStrings.twopointers;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//  Note that you must do this in-place without making a copy of the array.
public class moveZeroes {

    // Example 1:

    // Input: nums = [0,1,0,3,12]
    // Output: [1,3,12,0,0]
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] output = moveZeroes(nums);
        System.out.println(Arrays.toString(output));
    }

    public static int[] moveZeroes(int[] nums) {

        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right++;
            }


        }
        return nums;
    }
}
