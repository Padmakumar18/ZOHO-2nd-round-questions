//package SecondRound;


// Case 1: [4,8,7,6,9,0]
// 987640

import java.util.*;

// Case 2 : [4,18,78,6,9,65,0]
// 9786654180
public class GenerateGreatest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
//        int[] arr = {98,99,93,90,100,10,1,10000,90};
        int[] arr = {9,8};
        int start = 0;
        int max = 9 ;
        long ans = 0 ;

        System.out.println(generateGreatest(arr,start,max,ans,list));
    }
    public static long generateGreatest(int[] arr , int start , int max  , long ans, ArrayList<Integer> list)
    {
        if(max == 0)
        {
            return ans ;
        }

        pushElements(list , arr,max,start);
        start = start + list.size();
        for(int i=list.size()-1;i>=0;i--)
        {
            if(i != 0)
            {
                ans = value(ans,list.get(i-1),10);
                ans = ans + list.get(i);
            }
            else
            {
                ans = ans + list.get(0);
            }
        }
        list.clear();
        max -- ;

        return generateGreatest(arr,start,max,ans,list);
    }

    public static long value(long ans,int value,int multiplier)
    {
        if( value <= multiplier)
        {
            return ans * multiplier;
        }
        return value(ans,value,multiplier * 10);
    }

    public static void pushElements(ArrayList<Integer> list , int[] arr,int max ,int start)
    {
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i] == max || arr[i] / 10 == max)
            {
                list.add(arr[i]);
                arr[i] = -1;
            }
        }

        Collections.sort(list);

        for (int i = start; i < arr.length; i++)
        {
            if( arr[i] == -1 )
            {
                setZeroFront(arr,i);
                arr[0] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void setZeroFront(int[] arr, int i)
    {
        for(int j=i;j>0;j--)
        {
            arr[j] = arr[j-1];
        }
    }
}