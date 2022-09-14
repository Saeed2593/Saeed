package basics;

public class BingBang{
	public static void main(String args[])
	{
		int a=30;
		for(int i=1; i<=a; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Bing Bang");
}
			else if(i%3==0)
			{
				System.out.println("Bing" +i);
}
			else if(i%5==0)
			{
				System.out.println("Bang" +i);
}
			else
			{
				System.out.println(i);
			}
		}
	}


			
				


		
		




