//package SecondRound;

public class PallindromeString
{
    public static void main(String[] args)
    {
        String str = "abcddcba";
        int strat = 0;
        int end = str.length()-1;
        boolean flag = true;
        while(strat <= end)
        {
            if(str.charAt(strat) == str.charAt(end))
            {
                strat ++ ;
                end --;
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not a pallindrome");
        }
    }
}
