package servletDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student")
public class servletDto {
	@Id
	private int std_id;
	private String std_name;
	private String gender;
	@Column(unique=true)
	private long std_phno;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public long getStd_phno() {
		return std_phno;
	}
	public void setStd_phno(long std_phno) {
		this.std_phno = std_phno;
	}
	@Override
	public String toString() {
		return "servletDto [std_id=" + std_id + ", std_name=" + std_name + ", gender=" + gender + ", std_phno="
				+ std_phno + "]\n";
	}
	

}
