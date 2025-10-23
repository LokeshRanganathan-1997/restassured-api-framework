package ProgramPractise;

public class Oops_MethodOverloading {

	int add(int a, int b) {
		return a+b;
		
	}
	
	float add(float a, float b) {
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
		
	}
	
	double add(double a, double b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		
		Oops_MethodOverloading mo=new Oops_MethodOverloading();
		System.out.println(mo.add(10, 20));
		System.out.println(mo.add(10, 20, 30));
		System.out.println(mo.add(100, 200));
		
	}
}
