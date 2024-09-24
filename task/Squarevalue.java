package task;

import java.util.Scanner;
public class Squarevalue {
	
	int a;
	 int output;
	public void square(int a)
	{
		this.a = a;
	   this.output = a*a;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squarevalue sq = new Squarevalue();
		System.out.println("can you plse enter the number 1 to 10 :");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		
		if(num1 > 10)
		{
			System.out.println("please enter valid number");
		}
		else
		{
			sq.square(num1);
		}
		
		
		
		System.out.println(sq.output);

	}

}


