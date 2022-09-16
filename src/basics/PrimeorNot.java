package basics;


public class PrimeorNot {
	public static void main(String[] args)
	{
	int n=8;
	int t=0;
	for(int i=1; i<=n; i++)
	{
		if(n%i ==0)
		{
			t=t+1;
		}
	}
	if(t==2) {
		System.out.println("Pime Number");
	}
	else
	{
		System.out.println("Not a Pime Number");
	}
	}
}


