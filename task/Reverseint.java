package task;
import java.util.Scanner;
public class Reverseint {
	
	
	int num;
	int rev=0;
	int last;
	
	public void reverse(int num)
	{
		this.num = num;
		
		
		while(num>0)
		{
			last= num % 10;
			rev  = rev*10+last;
			num = num/10;
			
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverseint re = new Reverseint();
		System.out.println("enter the number : ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		
		re.reverse(num1);
		System.out.println(re.rev);

	}

}
