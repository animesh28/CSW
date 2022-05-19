
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=789;
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}
		System.out.println(rev);
	}

}
