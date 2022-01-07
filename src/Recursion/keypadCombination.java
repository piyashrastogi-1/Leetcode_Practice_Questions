/*
        17:- Given a string containing digits from 2-9 inclusive,
             return all possible letter combinations that the number could represent.
             Return the answer in any order.
             A mapping of digit to letters (just like on the telephone buttons) is given below.
             Note that 1 does not map to any letters..
*/


package Recursion;

import java.util.ArrayList;
import java.util.List;

public class keypadCombination {
    public static String mapping(char c)
    {
        if(c == '2') {
            return "abc";
        } else if (c == '3') {
            return "def";
        } else if (c == '4') {
            return "ghi";
        } else if (c == '5') {
            return "jkl";
        } else if (c == '6') {
            return "mno";
        } else if (c == '7') {
            return "pqrs";
        } else if (c == '8') {
            return "tuv";
        } else if (c == '9') {
            return "wxyz";
        }
            return "";
    }
    public List<String> letterCombinations(String digits) {
        List<String> list= new ArrayList<String>();
        if(digits.equals(""))return list;
        letterCombi(digits, "", list);
        return list;
    }
    private static void letterCombi(String inp, String out, List list) {

        if(inp.length() == 0) {
            list.add(out);
            return;
        }
        char cc0th = inp.charAt(0);//'2'
        String mappedString = mapping(cc0th);//"abc"

        for(int i = 0; i < mappedString.length(); i++) {
            char ith = mappedString.charAt(i);
            String ros = inp.substring(1);
            letterCombi(ros, out + ith, list);
        }
    }

   

    public static void main(String[] args)
    {
        keypadCombination obj = new keypadCombination();
        String str = "27";
        System.out.println(obj.letterCombinations(str));
    }
}
