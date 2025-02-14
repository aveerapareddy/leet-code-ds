package ArraysAndStrings;

//Example 4: 392. Is Subsequence.

        //Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

       // A subsequence of a string is a sequence of characters that can be obtained by deleting some (or none) of the characters from the original string, while maintaining the relative order of the remaining characters. For example, "ace" is a subsequence of "abcde" while "aec" is not.
public class SubSequence {

    public static void main(String[] args){
        String s= "dce";
        String t = "abcde";
        
       boolean output= subsequences(s,t);
       System.out.println(output);
    }

           private static boolean subsequences(String s, String t) {
            int left =0;
            int right=0;

            while (left < s.length() && right < t.length()) {

                if(s.charAt(left)==t.charAt(right)){
                    left++;
                }
                right++;
            }
         return s.length()==left;
           }

       }
