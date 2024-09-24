package task;

public class Publicmethod {
		int a;
		int b;
		
	public void Public(int a,int b)
		{
			this.a = a;
			this.b = b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicmethod input = new Publicmethod();
		int num1= input.a=230;
		int num2 =input.b=345;
		System.out.println(num1+num2);
	}

}
