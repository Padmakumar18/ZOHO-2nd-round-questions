public class CountTheVowels
{
    public static void main(String[] args) 
    {
        String str = "zoho";
        str = str.toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = 0; j < vowels.length(); j++) 
            {
                if(str.charAt(i) == vowels.charAt(j))
                {
                    count ++;
                }
            }
        }
        System.out.println("count");
        System.out.println(count);
    }    
}