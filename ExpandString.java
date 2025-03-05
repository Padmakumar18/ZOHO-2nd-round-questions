// Input : a1b10
// Output : abbbbbbbbbb


public class ExpandString
{
    public static void main(String[] args) {
        System.out.println("--------");
//        String str = "a5b9";
        String str = "b3c6d15";

        String ch = "";

        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 48 && str.charAt(i) <= 65)
            {
                int count = 0;
                for (int j = i; j < str.length(); j++)
                {
                    if(str.charAt(j) > 57  )
                    {
                        break;
                    }
                    if(count > 0)
                    {
                        count = count * 10 + str.charAt(j) - '0';
                    }
                    else
                    {
                        count = count + str.charAt(j) - '0';
                    }

                    if(str.charAt(j) == 48)
                    {
                        count = count * 10;
                    }
                }
                while(count-- !=0)
                {
                    System.out.print(ch);
                }
                ch = "";
            }
            else
            {
                ch = ch + str.charAt(i);
            }
        }
    }
}