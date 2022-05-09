package Assignment1;

public class Q10 {

	public static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		int a = 273;
		int b = 767;
		System.out.println("GCD: "+gcd(a,b));

	}

}
