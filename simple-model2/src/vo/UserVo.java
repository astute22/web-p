package vo;

public class UserVo {

	private String name;
	private String email;
	private Car myCar;
	
	public UserVo() {
		// TODO Auto-generated constructor stub
	}

	public UserVo(String name, String email, Car myCar) {
		super();
		this.name = name;
		this.email = email;
		this.myCar = myCar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType(){
		return "콩까지마";
	}
	
	@Override
	public String toString() {
		return "UserVo [name=" + name + ", email=" + email + "]";
	}

	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	
	
}
