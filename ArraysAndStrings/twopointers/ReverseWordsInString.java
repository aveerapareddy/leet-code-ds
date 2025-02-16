package ArraysAndStrings.twopointers;

//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String output = reverseString(s);
        System.out.println(output);
    }

    public static String reverseString(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] inputChar = words[i].toCharArray();
            int left = 0, right = inputChar.length - 1;
            while (left < right) {
                char temp = inputChar[left];
                inputChar[left] = inputChar[right];
                inputChar[right] = temp;
                left++;
                right--;
            }
            sb.append(new String(inputChar));
            if (i < words.length - 1) sb.append(" ");
        }

        return sb.toString();
    }
}
