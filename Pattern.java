//package SecondRound;


// Input : Water

//    w     w     w
//       a  a  a
//    w  a  t  e  r
//       e  e  e
//    r     r     r


public class Pattern
{
    public static void main(String[] args)
    {
        String str = "water";

        for(int i=0;i<str.length();i++)
        {
            for (int j = 0; j < str.length(); j++)
            {
                if(i == j || i + j == str.length()-1)
                {
                    System.out.print(str.charAt(i));
                }
                else if( j == ( str.length() - 1) / 2)
                {
                    System.out.print(str.charAt(i));
                }
                else if(i == ( str.length() - 1) / 2)
                {
                    System.out.print(str.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}