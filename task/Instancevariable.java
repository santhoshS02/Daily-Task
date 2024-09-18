package task;

public class Instancevariable {
	int a; //instance variable
	int b;
	 void instance (int aa,int bb)  
	 {
		 this.a=aa;
		 this.b=bb;
		 System.out.println(this.a);
		 System.out.println(this.b);
		 System.out.println(this.a*this.b);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevariable obj = new Instancevariable ();
		obj.instance(25,25);

	}

}
