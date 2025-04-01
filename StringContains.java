//package SecondRound;

public class StringContains
{
    public static void main(String[] args) {
        String str1 = "Sunday is";
        String str2 = "is";

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(0))
            {
                int c = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if(str2.charAt(j) == str1.charAt(i))
                    {
                        c++;
                        i++;
                    }
                }
                if(c == str2.length())
                {
                    System.out.println("yes");
                    break;
                }
                else
                {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}
