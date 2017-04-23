package cn.edu.tju.rico.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.edu.tju.rico.dto.UserDTO;

@Entity
@Table(name = "user_inf")
public class User {

	private int id;
	private String uname;
	private String passwd;
	private String gentle;
	private String email;
	private String city;

	public User() {
		super();
	}

	public User(UserDTO userDTO) {
		this.uname = userDTO.getUname();
		this.passwd = userDTO.getPasswd();
		this.gentle = userDTO.getGentle();
		this.email = userDTO.getEmail();
		this.city = userDTO.getCity();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getGentle() {
		return gentle;
	}

	public void setGentle(String gentle) {
		this.gentle = gentle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", gentle=" + gentle
				+ ", email=" + email + ", city=" + city + "]";
	}
	
}
