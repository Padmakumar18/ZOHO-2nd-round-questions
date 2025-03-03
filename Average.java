// Find the average of +ve , -ve and nutral values from  the given array
// case1 : 2,1,0,-8,-9
// output : 0.4 , 0.2 , 0.4

// case2 : 5,2,8,-2,-7,0,1,-3,6
//output : 0.556 , 0.112 , 0.3334

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Average
{
    public static void main(String[] args)
    {
//        int[] arr = {2,1,0,-8,-9};
        int[] arr = {5,2,8,-2,-7,0,1,-3,6};
        float positive = 0;
        float negative = 0;
        float nutral = 0;
        DecimalFormat df = new DecimalFormat("0.000");

        for (int j : arr)
        {
            if (j == 0)
            {
                nutral++;
            }
            else if (j < 0)
            {
                negative++;
            }
            else
            {
                positive++;
            }
        }
        BigDecimal bd = new BigDecimal(Float.toString(positive/arr.length));
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        System.out.println(bd);
        bd = new BigDecimal(Float.toString(negative/arr.length));
        bd = bd.setScale(3,RoundingMode.HALF_UP);
        System.out.println(bd);
        bd = new BigDecimal(Float.toString(nutral/arr.length));
        bd = bd.setScale(3,RoundingMode.HALF_UP);
        System.out.println(bd);
        System.out.println((positive/arr.length)+","+(negative/arr.length)+","+(nutral/arr.length));
    }
}
