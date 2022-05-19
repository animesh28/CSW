
public class Q1 {
	static boolean checkPrime(int n) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=false;
				break;}
				}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 97;
		boolean check=checkPrime(n);
		System.out.println(check);
	}

}
