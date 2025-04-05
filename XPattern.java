//package SecondRound;

public class XPattern {
    public static void main(String[] args) {
        System.out.println("-----------");
        String str = "PROGRAM";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if( j == i)
                System.out.print(str.charAt(i));
                else if(j == str.length()-1-i)
                System.out.print(str.charAt(j));
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
