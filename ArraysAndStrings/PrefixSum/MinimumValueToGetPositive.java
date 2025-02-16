package ArraysAndStrings.PrefixSum;

//Given an array of integers nums, you start with an initial positive value startValue.

//In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

//Return the minimum positive value of startValue such that the step by step sum is never less than 1.
public class MinimumValueToGetPositive {

    //  Input: nums = [-3,2,-3,4,2]
    // Output: 5
    // Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
    // step by step sum
    // startValue = 4 | startValue = 5 | nums
    /// (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
    //(1 +2 ) = 3  | (2 +2 ) = 4    |   2
    // (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
    //  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
    //  (4 +2 ) = 6  | (5 +2 ) = 7    |   2
    public static void main(String[] args) throws Exception {
        int[] nums = {-3, 2, -3, 4, 2};
        int ans = minStartValue(nums);
        System.out.println("Minimum Value " + ans);

    }

    //PREFIX SUM
    private static int minStartValue(int[] nums) {
        int minValue = 0;
        int total = 0;
        for (int num :
                nums) {
            total += num;
            minValue = Math.min(minValue, total);
        }


        return -minValue + 1;
    }
}
