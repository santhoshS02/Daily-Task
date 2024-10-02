package task;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {23,45,67,34,25,76};
		int b[] = {34,67,89,32,45,78};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j = 0; j<a.length ; j++)
			{
			if(a[i]==b[j])
			{
				System.out.println(" This  number are matched " + a[i] +" " + b[j]);
			}
			else if(a[i] != b[j])
			{
				System.out.println("This number are not matcher " + a[i] + " "+b [j ]);
			}
			
			}
			
		}

	}

}
