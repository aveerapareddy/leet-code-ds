import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int n = 100;
        int output= recursion(n);
        System.out.println(output);

    }

    public static int recursion(int n) {
        if (n <= 1)
        {
            return n;
        }
        int oneBackvalue = n - 1;
        int twoBackvalue = n - 2;
        int oneBack = recursion(oneBackvalue);
        int twoBack = recursion(twoBackvalue);
        return oneBack + twoBack;


    }
}
