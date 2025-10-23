package ProgramPractise;

public class ConstructorOverloading {
	String name;
	int year;
	
	ConstructorOverloading(){
		//name="Wills";
		//year=1997;
		this("Wills",1997);
	}

	
	ConstructorOverloading(String name){
		this.name=name;
		year=2000;
	}
	
	ConstructorOverloading(String name, int year){
		this.name=name;
		this.year=year;
	}
	
	public void show() {
		System.out.println("Brand name is :"+name+" "+" and Year is :"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading a=new ConstructorOverloading();
		ConstructorOverloading b=new ConstructorOverloading("Yash");
		ConstructorOverloading c=new ConstructorOverloading("KGF", 2020);
		a.show();
		b.show();
		c.show();

	}

}
