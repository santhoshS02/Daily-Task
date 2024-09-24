package task;

import java.util.Scanner;
public class Fibonic {
	
	int f = 0;
	int s =1;
	int temp ;
	int num;
	int rev=2;
	
	public void fibonic(int num)
	{
		while(rev <= num)
		{
			temp = f+s;
			f=s;
			s=temp;
			
			rev++;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonic fb = new Fibonic();
		System.out.println("enter the number : ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		
		
		

		fb.fibonic(num1);
		System.out.println(fb.temp);

		

	}

}
