package com.dbs.employeemngt.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
private String empId;
private String empFirstName;
private String empLastName;
private String adress;
private float empSalary;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public float getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(float empSalary) {
	this.empSalary = empSalary;
}

}

