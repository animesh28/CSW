package Assignment1;

public class Q6 {
	
	public static int[] sumArray(int[] arr, int n) {
		int maxSoFar = 0;
		int maxSum = Integer.MIN_VALUE;
		int l = 0 , r = 0;
		
		for(int i = 0; i < n; i++) {
			maxSoFar += arr[i];
			
			if(maxSoFar > maxSum) {
				maxSum = maxSoFar;
				r = i;
			}
			if(maxSum < 0) {
				maxSum = 0;
				l = i+1;
			}
		}
		int[] res = {maxSum, l,r};
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,3,5,-7,-8,-1,-3,-4,1};
		System.out.println(sumArray(arr, arr.length)[1] + " to "+sumArray(arr, arr.length)[2]);
		System.out.println(sumArray(arr, arr.length)[0]);
		
	}

}
