//package SecondRound;

// Print the string in Z pattern

// Case 1 : zohocorporationteam
// z o h o c o r
//           p
//         o
//       r
//     a
//   t
// i o n t e a m
public class ZPattern
{
    public static void main(String[] args)
    {
        String str = "abcdefghij";
        int index = 0;

        int X = ( str.length() / 3 ) + 1 ;
        if( ( X - 2 ) == ( str.length() - ( X * 2 ) ) )
        {
            for (int i = 0; i < X; i++)
            {
                for (int j = 0; j < X; j++)
                {
                    if( i == 0 || i == X - 1 || j + i == X -1)
                    {
                        System.out.print(str.charAt(index++)+ " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Not a valid string");
        }
    }
}