package polymorphism;

public class Childclass extends Parentclass {
	final int b=60;
	@Override
	
	
	public void display()

	{
		
		System.out.println("Child class");
		super.display();
		//b=70;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubChildclass
		
		Childclass obj = new Childclass();
		obj.display();
	}

}
