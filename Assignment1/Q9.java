package Assignment1;

public class Q9 {
	
	public static void toh(int n, char s, char d, char h) { 
		if(n == 0)
			return;
		
		toh(n-1, s, h, d);
		System.out.println(n+" Plate [ "+s+" -> "+d+" ]");
		toh(n-1, h, d, s);
	}

	public static void main(String[] args) {
		char source = 'A';
		char dest = 'B';
		char helper = 'C';
		toh(3,source,dest,helper);

	}

}
