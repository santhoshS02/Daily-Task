package task;

import java.util.Scanner;
public class Sumoffdigits {

	
	int num;
	int sum=0;
	int last;
	
	public void sum(int num)
	{
		this.num= num;
		
		while(num > 0)
		{
			last= num%10;
			sum= sum+last;
			num= num/10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sumoffdigits sm = new Sumoffdigits();
		
		System.out.println("enter the number ");
		Scanner num = new Scanner(System.in);
		
		int num1 = num.nextInt();
		
		sm.sum(num1);
		
		System.out.println(sm.sum);

	}

}
