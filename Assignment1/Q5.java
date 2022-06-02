import java.util.*;

/*Given an array, write a program to rotate its element K number of times.
Explain its time complexity.*/

public class Q5 {
static void RightRotate(int a[],
                        int n, int k)
{
    k=k%n;
 
    for(int i = 0; i < n; i++)
    {
        if(i<k)
        {
            System.out.print(a[n + i - k]
                             + " ");
        }
        else
        {
            System.out.print(a[i - k]
                             + " ");
        }
    }
    System.out.println();
}
     
public static void main(String args[])
{
    int Array[] = {1, 2, 3, 4, 5};
    int N = Array.length;
 
    int K = 2;
    RightRotate(Array, N, K);
 
}

}
