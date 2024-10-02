package task;

public class OddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumeven =0;
		int oddvalue=0;
		
		int a[]= {12,23,43,56,76,42,33,88};
		
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i] %2 == 0)
				{
					
					sumeven++;
					
				}
				else if(a[i] %2 !=0)
				{
					oddvalue++;				
					}
			
		}
		
		System.out.println(" This is the number of even value in the array : "+ sumeven);
		System.out.println(" This is the number of odd value in the array : " + oddvalue);

	}

}
