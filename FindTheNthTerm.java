
// 3,7,33,37,73,77,333,337,373,377.....
// Input : 0
// Output : 3

import java.util.ArrayList;

public class FindTheNthTerm
{
    public static void main(String[] args)
    {
        int getIndex = 0;
        System.out.println(getValue(getIndex));
    }

    public static int getValue(int getIndex)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int cons1 = 3, cons2 = 7, no1 = 0, no2 = 0, temp1 = 0, temp2 = 0,index = 0;
        no1 = (temp1 * 10) + cons1;
        no2 = (temp2 * 10) + cons2;
        al.add(no1);// 0
        al.add(no2);// 1
        while (true)
        {
            for (int i = 1; i <= 2; i++)
            {
                if (i == 1)
                {
                    temp1 = al.get(index++);
                    no1 = (temp1 * 10) + cons1;
                    al.add(no1);
                    no1 = (temp1 * 10) + cons2;
                    al.add(no1);
                }
                else
                {
                    temp2 = al.get(index++);
                    no2 = (temp2 * 10) + cons1;
                    al.add(no2);
                    no2 = (temp2 * 10) + cons2;
                    al.add(no2);
                }

            }
            if (al.size() > 100)
                break;
        }

        return al.get(getIndex);
    }
}