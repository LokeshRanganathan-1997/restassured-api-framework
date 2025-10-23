package ProgramPractise;

public class Oops_abstract_Child extends Oops_abstract_Parent{
 	@Override
	void Vehicle() {
		// TODO Auto-generated method stub
System.out.println("This is vehcile prod");		
	}
 	
 	public static void main(String[] args) {
		
 		Oops_abstract_Parent abs=new Oops_abstract_Child();
 		abs.Vehicle();
 		abs.mobiles();
	}
}
