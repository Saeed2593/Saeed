package basics;


public class Swappingusingarray{
	public static void main(String[] args) {
	int a[]= {1,2,3,7,6};
	int l=a.length-1;
	int t=a[l];
	
	
	for(int i=a.length-1; i>0; i--)
	{

a[i]=a[i-1];
	}
	a[0]=t;
	
	System.out.print(a[0]);
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	System.out.print(a[4]);
	
}
}




