package day25task;

public class Rectangular {
	int height = 50;
	int width = 50;
	
	public void rectangular()
	{
		int area = height*width;
		int perimeter = (height+width)*2;
		System.out.println(" the are of rectangular  : " + area);
		System.out.println("the perimater of rectangular is : " + perimeter);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangular r = new Rectangular();
		r.rectangular();
		
	}

}
