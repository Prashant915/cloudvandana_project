import java.util.*;
public class number_shuffling
{
    static void rand( int array[], int a)
    {
        Random rd = new Random();
        for (int i = a-1; i > 0; i--) {
            int j = rd.nextInt(i+1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args)
    {

        int[] ar = {1, 2, 3, 4, 5, 6, 7};
        int b = ar.length;
        rand (ar, b);
        System.out.println(Arrays.toString(ar));
    }
}