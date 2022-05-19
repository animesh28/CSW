import java.util.*;

/*Given an array, write a program to rotate its element K number of times.
Explain its time complexity.*/

public class Q5 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
		
int [] arr= {22,32,11,54,67,89};
int k=sc.nextInt();
while( k!=0) {
	int key=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	arr[i+1]=key;	
	}
	/*arr[arr.length-1]=key;*/
	k--;
 }
for(int e: arr)
	System.out.print(e+" ");
	}

}
