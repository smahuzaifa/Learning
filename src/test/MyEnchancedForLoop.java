package test;

public class MyEnchancedForLoop {
    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5,6,7,8,9};
        for(int b: a)
        {
            if( b % 2 == 0)
            System.out.println(b);
        }
        System.out.println("hello");
    }
}
