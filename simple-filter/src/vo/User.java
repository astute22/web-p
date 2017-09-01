package vo;

public class User {

	private String name;
	private String id;
	private String pw;
	private String role;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String id, String pw, String role) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
