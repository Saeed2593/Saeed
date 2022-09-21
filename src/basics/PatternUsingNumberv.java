package basics;


public class PatternUsingNumberv{
	public static void main(String[] args) {
	int n=5;
	for(int i=n-1; i>=0; i--)
	{
	for(int j=n-1; j>i; j--)
	{
	 System.out.print(" ");
	}
	System.out.print((char)(i+65));
	for(int j=1; j<(i*2); j++)
	{
		 System.out.print(" ");
		}
	if(i>=1)
	{
		System.out.print((char)(i+65));
	}
	System.out.print("\n");
	
}
}
}





