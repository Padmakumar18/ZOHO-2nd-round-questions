//package SecondRound;

// Find a string A can be formed a few characters from the other given string B , if so string A becomes a sub-sequenced of string B . A is said to be
// a sub-sequence of B, If A can be obtaibned by deleting some characters of B without changing the order of the remaining characters in B .
// Determine if A is a sub-sequence of B.

// Example : set sangeet
// Output : Yes

// Example : zoho india
// Output : Yes

// Example : set step
// Output : No


public class StringA_StringB
{
    public static void main(String[] args)
    {
        System.out.println(fun("set" , "step"));
    }

    public static String fun(String findStr , String str)
    {
        int index = 0;
        int count = 0;
        for (int i = 0; i < findStr.length(); i++)
        {
            for (int j = index; j < str.length(); j++)
            {
                if(str.charAt(j) == findStr.charAt(i))
                {
                    count ++ ;
                    index = j + 1;
                }
            }
        }
        return count >= findStr.length() ?  "Yes" : " No" ;
    }
}
