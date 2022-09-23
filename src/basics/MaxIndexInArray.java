package basics;


public class MaxIndexInArray{
	public static void main(String[] args) {
	int a[] = {6,8,2,10,12};
	int max=a[0];
	int index=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max) 
		{
			max=a[i];
			index = i;
		}
	}
			System.out.print(index);
		
}
	}
	
	






