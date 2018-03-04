package com.inder.demoSqlApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {
	
	@Id
	private int empid;
	
	private String empname;
	
	private String empmail;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpmail() {
		return empmail;
	}

	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}

	@Override
	public String toString() {
		return "EmployeeModel [empid=" + empid + ", empname=" + empname + ", empmail=" + empmail + "]";
	}
	
}
