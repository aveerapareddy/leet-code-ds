package ArraysAndStrings.SlidingWindow;

//Example 1: Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
public class FindLegthOfSTring {

    public static void main(String[] args) throws Exception {
        String input = "1101100111";
        int output = findLength(input);
        System.out.println("Longest SubString Length " + output);

    }

    //SLIDING WINDOW
    private static int findLength(String input) {
        int answer = 0;
        int left = 0;
        int curr = 0; // current number of zeros in the window

        for (int right = 0; right < input.length(); right++) {
            if (input.charAt(right) == '0') {
                curr++;
            }
            while (curr > 1) {
                if (input.charAt(left) == '0') {
                    curr--;
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
