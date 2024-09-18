package task;

public class Parameter {
	String name;
	int emid;
	int salary;
	int bonous;
	
	Parameter(String n,int id,int s,int b)
	{
		this.name=n;
		this. emid=id;
		this. salary=s;
		this. bonous=b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter value= new Parameter("ashok",358,50000,15000);
		System.out.println(value.name+" " + value.emid + " " + value.salary + " " + value.bonous );
		
	}

}
