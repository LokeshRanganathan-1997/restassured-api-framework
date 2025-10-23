package ProgramPractise;

public class EncapsulationConcepts {
	private String carBrand;
	private String carName;
	private int carYear;
	
	public String getCarBrand() {
		return carBrand;
		
	}
	
	public String getCarName() {
		return carName;
		
	}
	
	public int getCarYear() {
		return carYear;
		
	}

	public void setCarBrand(String carBrand) {
		this.carBrand=carBrand;
	}
	
	public void setCarName(String carName) {
		this.carName=carName;
	}
	
	public void setCarYear(int carYear) {
		this.carYear=carYear;
	}
	public static void main(String[] args) {
		
		EncapsulationConcepts ec=new EncapsulationConcepts();
		ec.setCarBrand("Benz");
		ec.setCarName("E_Class");
		ec.setCarYear(1997);
		
		System.out.println("Car brand is :"+ec.getCarBrand());
		System.out.println("Car name is :"+ec.getCarName());
		System.out.println("Car year is :"+ec.getCarYear());
		
	}
}
