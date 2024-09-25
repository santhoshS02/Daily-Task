package day25task;

public class Person {
	String name;
	int age;
	
	Person(String n , int a)
	{
		this.name=n;
		this.age=a;
	}
	public void person()
	{
		System.out.println("the name and age of the person is  " + "name :" + name + " age :  " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("jhon" , 24);
		Person p1 = new Person("rahkul" , 23);

		p.person();
		p1.person();
		
	}

}
