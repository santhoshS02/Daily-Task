package task;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {13,5,67,89,34,23,105};
		int largest = a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}	
			if(largest<a[i])
			{
				System.out.println(a[i]);
			}
}
		System.out.println(largest);

	}
	
}
