package ArraysAndStrings.twopointers;

//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
public class GetCommon {

    //Input: nums1 = [1,2,3], nums2 = [2,4]
    //Output: 2
    //Explanation: The smallest element common to both arrays is 2, so we return 2.
    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {1, 2};
        int output = getCommon(nums1, nums2);
        System.out.println(output);
    }

    private static int getCommon(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int output = -1;

        while (left <= nums1.length && right <= nums1.length) {
            if (nums1[left] == nums2[right]) {
                return nums1[left];
            } else if (nums1[left] < nums2[right]) {
                left++;

            } else {
                right++;
            }
        }
        return output;
    }
}
