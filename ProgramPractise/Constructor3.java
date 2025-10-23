package ProgramPractise;

public class Constructor3 {
	
	//Parameterized Constructors
	
	String brand;
	Constructor3(String a){
		brand=a;
	}
	
	public void show() {
		System.out.println("BrandName is :"+brand);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor3 cons=new Constructor3("Benz");
		cons.show();

	}

}
