//Given a set of numbers like <10,36,54,89,12> we want to find sum of weights based on the conditions
// 1. 5 = if perfect square root
// 2. 4 = if multiple of 4 and divisible by 6
// 1. 3 = if even number

import java.util.ArrayList;

public class SumOfWeight 
{
    public static void main(String[] args) 
    {
        System.out.println();
        int[] arr = {10,36,54,89,12};
        ArrayList<Integer> ansArr = new ArrayList<Integer>();
        for (int integer : arr) 
        {
            findWeight(integer, ansArr);
        }

        changeIndex(arr, ansArr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("<" + arr[i] + ","+ansArr.get(i)+">");
        }
    }    

    public static void findWeight(int num,ArrayList<Integer> ansArr)
    {
        int weight = 0 ;
        int i = 0;
        while(i*i <= num)
        {
            if(i * i ++ == num)
            {
                weight = weight + 5;
            }
        }

        if(num % 4 == 0 && num % 6 == 0)
        {
            weight += 4 ;
        }

        if(num %2 ==0)
        {
            weight += 3;
        }

        ansArr.add(weight);
    }

    public static void changeIndex(int[] arr,ArrayList<Integer> ansArr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start = low ;
        int end = high ;
        int pivot = ansArr.get(start+(end-start)/2);
        while(start<=end)
        {
            while (ansArr.get(start)>pivot) {
                start ++;
            }
            while (ansArr.get(end)<pivot) {
                end --;
            }
            if(start<=end)
            {
                swap(arr, ansArr, start, end);
                start++;
                end --;
            }
        }
        changeIndex(arr, ansArr, start, high);
        changeIndex(arr, ansArr, low, end);
    }

    public static void swap(int[] arr,ArrayList<Integer> ansArr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;

        temp = ansArr.get(i);
        ansArr.set(i, ansArr.get(j));
        ansArr.set(j, temp);
    }
}