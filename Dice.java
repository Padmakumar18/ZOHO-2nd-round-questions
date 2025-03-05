public class Dice
{
    public static void main(String[] args) {
        fun("",4);
    }

    public static void fun(String p,int t)
    {
        if(t == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i<= t && i <= 6; i++)
        {
            fun(p+i,t-i);
        }
    }
}
