package day25task;

public class Overloading {
		String title;
		String author;
		int price;
		
		Overloading(String t, String a)
		{
			this.title = t;
			this.author=a;
		}
		
		Overloading(String t, String a, int p)
		{
			this.title = t;
			this.author=a;
			this.price = p;
		}
		public void book()
		{
			if(price ==0) {
			System.out.println("In this book title and author is : " + title + " " + author );
			}
			else
			{
				
			
			System.out.println("In this book title ,  author and then price   is : " + title + ", " + author + " ," + price );

			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading ol = new Overloading("wingsofffire" , " abdulkalam");
		Overloading ol1 = new Overloading("wingsofffire" , " abdulkalam",950);

		ol.book();
		ol1.book();

	}

}
