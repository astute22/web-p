package vo;

public class Car {

	private int year;
	private String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int year, String name) {
		super();
		this.year = year;
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}