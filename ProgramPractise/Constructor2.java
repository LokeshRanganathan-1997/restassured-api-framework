package ProgramPractise;

public class Constructor2 {
	//Default constructors
	String Brand;
	
    Constructor2(){
    	Brand="Audi";
    }

    public void show() {
    	System.out.println("Brand name is :"+Brand);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 cons=new Constructor2();
		cons.show();
		

	}

}
