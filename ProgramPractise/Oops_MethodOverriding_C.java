package ProgramPractise;

public class Oops_MethodOverriding_C extends Oops_MethodOverriding_P{
	void animal() {
		System.out.println("This is animal from Child");
	}

	public static void main(String[] args) {
	Oops_MethodOverriding_P mop=new Oops_MethodOverriding_C();
	mop.animal();
		
		
	}
}
