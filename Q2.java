import java.util.*;
class Student {
	String name;
	int age;
	double marks;
	Scanner sc = new Scanner(System.in);
	
	Student() {
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter age: ");
		this.age = sc.nextInt();
		System.out.print("Enter marks: ");
		this.marks = sc.nextDouble();
	}
	
	public boolean isEqual(Student obj) {
		if(!obj.name.equals(this.name)) return false;
		if(obj.age != this.age) return false;
		if(obj.marks != this.marks) return false;
		
		return true;
	}
}

class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);	
	}
	
}



public class Q2 {
	static Scanner sc = new Scanner(System.in);
	
	public static Student RBinSearch(Object[] a, int l, int h, Student key) { 
		
		if(l <= h) {
			int mid = l + (h-l) / 2;
			
			if(((Student)a[mid]).isEqual(key)) return key;
			
			if(((Student)a[mid]).name.compareTo(key.name) > 0)
				return RBinSearch(a, mid+1, h, key);
			
			return RBinSearch(a, l, mid-1, key);
		}
		
		return null;
	}

	public static void printList(LinkedList<Student> list) {
		for(Student s: list) {
			System.out.println("**************************************");
			System.out.println("Name: "+s.name);
			System.out.println("Age: "+s.age);
			System.out.println("Marks: "+s.marks);
			System.out.println("**************************************");
		}
	}

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		System.out.print("Enter list size: ");
		int t = sc.nextInt();
		System.out.println("Enter all elements");
		while(t-- > 0) {
			list.add(new Student());
		}
		printList(list);
		LinkedList<Student> tmp = new LinkedList<Student>(list);
		
		
		System.out.println("Enter student details to be searched");
		Student key = new Student();
			
		Collections.sort(list, new SortByName());
		
		printList(list);
		
		Student indexFoundAt = RBinSearch(list.toArray(), 0, list.size()-1, key);
		if(indexFoundAt != null)	System.out.println("Item found in list");
		else System.out.println("Item not found");
		
		list = new LinkedList<Student>(tmp);
		
		System.out.print("\nEnter index to be deleted: ");
		int indexToRemove = sc.nextInt();
		list.remove(indexToRemove);
		
		printList(list);

		System.out.println("\nCount: "+list.size());
	}

}
