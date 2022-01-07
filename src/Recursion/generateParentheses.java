package Recursion;

import java.util.ArrayList;
import java.util.List;

// 22:- Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

public class generateParentheses {

    public List<String> generateParenthesis(int n)
    {
        List<String> list= new ArrayList<String>();
        calc(0, 0, n, "", list);
        return list;
    }
    private void calc(int oc, int cc, int n, String str, List list)
    {
        if(oc==n && cc==n)
        {
            list.add(str);
            return;
        }
        if(oc > cc)
        {
            calc(oc, cc + 1, n, str + ')', list);
        }
        if(oc<n)
        {
            calc(oc + 1, cc, n, str + '(', list);
        }
    }
    public static void main(String[] args)
    {
        generateParentheses obj= new generateParentheses();
        System.out.println(obj.generateParenthesis(3));
    }
}
