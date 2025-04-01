//package SecondRound;

// Given an array of number
/// You need to find a weights based on the fallowing conditions
// 5 points if a perfect square
// 4 points if multiple of 4 and 6
// 3 points if even number

// Case1 : [10,36,3,49,12]
// Output : [36,12,49,10,3]

// Case1 : [20,49,6,64,12]
// Output : [64,12,49,20,6]

// Case1 : [8,25,2,82,32]
// Output : [81,25,32,8,2]

import java.util.Arrays;

public class SortTheArray
{
    public static void main(String[] args)
    {
//        int[] arr = {10, 36, 3, 49, 12};
         int[] arr = {20, 49, 6, 64, 12};
        // int[] arr = {8, 25, 2, 82, 32};
        int[] points = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            points[i] = checkPoints(arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (points[i] < points[j])
                {
                    // Swap points
                    int tempPoints = points[i];
                    points[i] = points[j];
                    points[j] = tempPoints;

                    // Swap corresponding elements in arr
                    int tempArr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArr;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(points));
    }

    public static int checkPoints(int num)
    {
        int point = 0;
        int i = 1;
        while (i * i < num)
        {
            i++;
        }
        if (i * i == num)
        {
            point += 5;
        }
        if (num % 4 == 0 && num % 6 == 0)
        {
            point += 4;
        }
        if (num % 2 == 0)
        {
            point += 3;
        }
        return point;
    }
}
