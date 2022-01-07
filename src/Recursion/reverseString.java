/*
        344:- Write a function that reverses a string. The input string is given as an array of characters s.
              You must do this by modifying the input array in-place with O(1) extra memory.
*/

package Recursion;

public class reverseString {
    public void revString(char[] s)
    {
        newRev(0, s.length-1, s);

    }
    private void newRev(int start, int end,char[] s)
    {
        if (start >= end)
        {
            return;
        }
        char t = s[start];
        s[start] = s[end];
        s[end] = t;
        newRev(start + 1, end - 1, s);
    }
    public static void main(String[] args)
    {
        reverseString obj = new reverseString();
        char[] s= {'a','b','c'};
        obj.revString(s);
        for(char c: s)
        {
            System.out.print(c + " ");
        }
    }
}
