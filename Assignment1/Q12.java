package Assignment1;

import java.util.Arrays;

public class Q12 {

	public static int RBinSearch(int[] a, int l, int h, int value) { 
		
		if(l <= h) {
			int mid = l + (h-l) / 2;
			
			if(a[mid] == value) return mid;
			
			if(a[mid] < value)
				return RBinSearch(a, mid+1, h, value);
			
			return RBinSearch(a, l, mid-1, value);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 99, 104, 29, 2, 5, 20, 32, 4, 21, 22, 1, 2, 5, 6};
		Arrays.sort(arr);
		System.out.println(RBinSearch(arr, 0, arr.length-1, 22));
	}

}
