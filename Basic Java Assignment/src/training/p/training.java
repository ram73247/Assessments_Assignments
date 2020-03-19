package training.p;

public class training extends Method{
	
	public static void main(String []args)
	{
		
		training t = new training(17,2);
		t.automation();
		t.manual();
		t.SomeMethod();
		
	}
	
	training(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
	public void manual()
	{
		System.out.println("Manual testing");
	}
	
	public void automation()
	{
		System.out.println("Automation testing");
	}
}
