import java.util.*;

public class Q1 {
	
	public static int RBinSearch(Object[] a, int l, int h, int value) { 
		
		if(l <= h) {
			int mid = l + (h-l) / 2;
			
			if((int)a[mid] == value) return mid;
			
			if((int)a[mid] < value)
				return RBinSearch(a, mid+1, h, value);
			
			return RBinSearch(a, l, mid-1, value);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter list size: ");
		int t = sc.nextInt();
		System.out.println("Enter all elements");
		while(t-- > 0) {
			list.add(sc.nextInt());
		}
		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
		System.out.println(list);
		
		System.out.print("\n\nEnter value to be searched: ");
		int key = sc.nextInt();
		Collections.sort(list);
		int indexFoundAt = RBinSearch(list.toArray(), 0, list.size()-1, key);
		
		if(indexFoundAt != -1 )	System.out.println("Item found at "+indexFoundAt+" index");
		else System.out.println("Item not found");
		
		list = new ArrayList<Integer>(tmp);
		
		System.out.print("\nEnter index to be deleted: ");
		int indexToRemove = sc.nextInt();
		list.remove(indexToRemove);
		
		System.out.println(list);
		
		if(list.isEmpty()) System.out.println("\nList is empty");
		else System.out.println("\nList is not empty");
		
	}
}
