package Assignment1;
import java.util.*;

public class Q11 {
	
	public static void swap(ArrayList<Integer> s, int i, int j) {
		int tmp = s.get(i);
		s.set(i, s.get(j));
		s.set(j, tmp);
	}

	public static void permute(ArrayList<Integer> s, int l, int r, int count) {
		
		if(l == r) {
			System.out.println(s);
			return;
		}
		
		for(int i = l; i <= r; i++) {
			swap(s,l,i);
			permute(s,l+1,r,++count);
			swap(s,l,i);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(20);
			add(24);
			add(28);
			add(102);
			add(70);
			add(303);
		}};
		permute(list, 0, list.size()-1, 0);

	}

}
