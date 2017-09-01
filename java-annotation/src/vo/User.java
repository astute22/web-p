package vo;

import custom.annotation.Column;
import custom.annotation.Table;

@Table(name = "TB_USER", generated=true)
public class User {

	@Column(name="USER_NO", type="NUMBER")
	private int no;
	@Column(name="USER_NAME", type="VARCHAR2")
	private String name;
	@Column(name="USER_EMAIL", type="VARCHAR2")
	private String email;
	@Column(name="PHONE_NUMBER", type="VARCHAR2")
	private String phone;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
