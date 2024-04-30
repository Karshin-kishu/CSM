package com.app.Customer;

import java.time.LocalDate;

import com.app.Plan.Service;

public class Customer {
	private int idd;
	private static int id;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private Double regamt;
	private LocalDate dob;
	private Service sname;
	
	static {
		 id =100;
	}
	public Customer(String fname, String lname, String email, String pwd, Double regamt, LocalDate dob, Service sname) {
		super();
		this.idd = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.regamt = regamt;
		this.dob = dob;
		this.sname = sname;
		id++;
	}

	@Override
	public String toString() {
		return "Customer [id="+ idd + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd=" + pwd + ", regamt="
				+ regamt + ", dob=" + dob + ", sname=" + sname + "]";
	}

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Customer.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Double getRegamt() {
		return regamt;
	}

	public void setRegamt(Double regamt) {
		this.regamt = regamt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Service getSname() {
		return sname;
	}

	public void setSname(Service sname) {
		this.sname = sname;
	}
	
}
