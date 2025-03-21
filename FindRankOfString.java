import java.util.*;

public class FindRankOfString
{
    public static void main(String[] args)
    {
        String input = "String";
        input = input.toLowerCase();
        List<String> permutations = generatePermutations(input.toLowerCase());
        System.out.println(permutations);
        Collections.sort(permutations);
        System.out.println(permutations);
        System.out.println(permutations.indexOf(input)+1);
    }

    static void backtrack(List<String> permutations, String current, String remaining)
    {
        if(remaining.length() == 0)
        {
            permutations.add(current);
            return;
        }

        for(int i = 0; i < remaining.length(); i++)
        {
            String newCurrent = current + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            backtrack(permutations, newCurrent, newRemaining);
        }
    }

    static List<String> generatePermutations(String str)
    {
        List<String> permutations = new ArrayList<>();
        backtrack(permutations, "", str);
        return permutations;
    }
}