package day25task;

import java.util.Scanner;
public class Employee {

		String name= "ramya";
		String jobtitle = " developer";
		float salary;
		
		public void employee(float sa )
		{
			
			this.salary = sa;
		}
		
		void details()
		{
			System.out.println("the details about employee is " + name  + " " + jobtitle + " " + salary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em = new Employee();
		System.out.println("enter the salary ");
		Scanner amount = new Scanner(System.in);
		float amounts =amount.nextFloat();
		
		em.employee(amounts);
		em.details();
	}

}
