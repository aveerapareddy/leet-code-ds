package ArraysAndStrings;


import java.util.ArrayList;
import java.util.List;

//Example 3: Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.
public class CombineTwoArrays {

    public static void main(String[] args){

        int [] array1 = {1,4,7,20};

        int[] array2 = {3,5,6};

        List<Integer> answer = combine(array1, array2);
        System.out.println(answer);
    }
          // TWO POINTERS , ARRAYS 
    static List<Integer> combine(int[] array1, int[] array2){
        List<Integer> answer= new ArrayList<>();

        int left =0;
        int right=0;

        while (left< array1.length && right < array2.length){

            if(array1[left] < array2[right]){
                answer.add(array1[left]);
                left++;
            } else {
                answer.add(array2[right]);
                right++;
            }
        }

        while (left <  array1.length){
            answer.add(array1[left]);
            left++;
        }

        while (right <  array2.length){
            answer.add(array2[right]);
            right++;
        }

        return answer;
    }
}
