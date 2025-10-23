package ProgramPractise;

public class Oops_Inheritance_C extends Oops_Inheritance_P{
	public void car() {
		System.out.println("This is car production");
	}
	
	public void bus() {
		System.out.println("This is bus production");
	}

	public static void main(String[] args) {
		Oops_Inheritance_C c=new Oops_Inheritance_C();
		c.Vehicle();
		c.bus();
		c.car();
	}
}
