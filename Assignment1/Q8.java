package Assignment1;

import java.util.Arrays;

public class Q8 {
	
	public static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}

	public static void orderIndex(int[] a, int n) {
		for(int i = 0; i < n; i++) {
			if(a[i] != -1 && a[i] != i)
				swap(a,i,a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0,3,1,-1,2,4,6,-1,-1,9};
		orderIndex(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
