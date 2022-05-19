
public class Q2 {
	static int binary(int n) {
		int b=0,c=0;
		while(n!=0) {
			int rem = n % 2;
            int cnt = (int)Math.pow(10, c);
            b += rem * cnt;
            n/= 2;
            c++;
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int bin= binary(n);
		System.out.println(bin);
	}

}
