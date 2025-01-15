package com.UvTech.EMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class EMSEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer Id;
	 private String  eName;
	 private String  lName;
	 private String  Department;
	 private String  Dob;
	 private String Address;
	public EMSEntity( String eName, String lName, String department, String dob, String address) {
		super();
		
		this.eName = eName;
		this.lName = lName;
		this.Department = department;
		this.Dob = dob;
		this.Address = address;
	}
	public EMSEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "EMSEntity [Id=" + Id + ", eName=" + eName + ", lName=" + lName + ", Department=" + Department + ", Dob="
				+ Dob + ", Address=" + Address + "]";
	}
	
        
}
