package Assignment1;

public class Q6 {
	
	public static int[] sumArray(int[] arr, int n) {
		int maxSoFar = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			maxSoFar += arr[i];
			
			if(maxSoFar > maxSum) {
				maxSum = maxSoFar;
			}
			if(maxSum < 0) {
				maxSum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,3,5,-7,-8,-1,-3,-4,1};
		System.out.println(sumArray(arr, arr.length));
		
	}

}
