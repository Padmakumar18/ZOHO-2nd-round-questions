//package SecondRound;

// arr1 = 2,4,5,6,7,9,10,13
// arr2 = 2,3,4,5,6,7,8,9,11,15
// Output : 2,3,4,5,6,7,8,9,10,11,13,15

import java.util.ArrayList;

public class MergeSortArray
{
    public static void main(String[] args)
    {
        int[] arr1 = {0,98};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,11,15,16,98,100};
        int start = 0;
        ArrayList<Integer> finalArray = new ArrayList<>();

        for (int j : arr1)
        {
            start = addElements(finalArray, j, start, arr2);
        }
        if(start != arr2.length)
        {
            for (int i = start;i<arr2.length;i++)
            {
                finalArray.add(arr2[i]);
            }
        }
        System.out.println(finalArray);
    }

    public static int addElements(ArrayList<Integer> finalArray,int element,int start,int[] arr2)
    {
        for (int i = start; i < arr2.length; i++)
        {
            if(arr2[i] > element )
            {
                if(finalArray.size()==0 || (finalArray.size()==1 && finalArray.get(0) != element) ||  finalArray.getLast() != element)
                {
                    finalArray.add(element);
                }
                return start;
            }
            else if(element == arr2[i] && (!finalArray.isEmpty() || finalArray.get(i-1) != element))
            {
                finalArray.add(element);
                start++;
            }
            else if( arr2[i] < element )
            {
                finalArray.add(arr2[i]);
                start++;
            }
        }
        if(finalArray.getLast() < element)
        {
            finalArray.add(element);
        }
        return start;
    }
}