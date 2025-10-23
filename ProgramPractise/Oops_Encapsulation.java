package ProgramPractise;

public class Oops_Encapsulation {
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setId(int id){
		this.id=id;		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getId() {
		return id;
		
	}
	public static void main(String[] args) {
		Oops_Encapsulation oop=new Oops_Encapsulation();
		oop.setName("Wills");
		oop.setId(1234);
		System.out.println("Value of name is :"+oop.getName());
		System.out.println("Value of Id is :"+oop.getId());
		
	}

}
