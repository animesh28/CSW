
public class Q4 {
	static int Search(int ar[],int l,int r,int x) {
		if(r>=l) {
			 int mid=l+(r-l)/2;
		if(ar[mid]==x)
			return mid;
		if(ar[mid]>x)
			return Search(ar,l,mid-1,x);
		return Search(ar,mid+1,r,x);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,3,4,5,8,9};
		int n=ar.length;
		int x=5;
		int res=Search(ar,0,n-1,x);
		if(res==-1)
			System.out.println("element not found");
		else 
			System.out.println("element found "+res);
	}

}
