package Assignment1;

import java.util.Arrays;

public class Q7 {
	
	public static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}
	
	public static void sort(int[] a, int n) {
	
		for(int i = 0; i < n; i+=2) {
			
			if(i > 0 && a[i] < a[i-1])
				swap(a,i,i-1);
			
			if(i < n-1 && a[i] < a[i+1])
				swap(a,i,i+1);
		
		}
	}

	public static void main(String[] args) {
		int arr[] = {12, 99, 104, 29, 2, 5, 20};
		sort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
