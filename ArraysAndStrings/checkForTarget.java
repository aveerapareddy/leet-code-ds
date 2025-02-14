package ArraysAndStrings;

public class checkForTarget {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8, 9, 14, 15};
        boolean checkForTarget = checkForTargetTwoSum(numbers, 13);
        System.out.println(checkForTarget);
    }

    // JAVA
    private static boolean checkForTargetTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int current = numbers[left] + numbers[right];
            if (current == target) {
                return true;
            }
            if(current > target){
                right --;
            }else{
                left ++;
            }
        }
        return false;
    }

}
