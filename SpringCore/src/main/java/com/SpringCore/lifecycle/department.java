package com.SpringCore.lifecycle;

public class department {
	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "department [dname=" + dname + "]";
		
	}
	
	public void init() {
		System.out.println("initialize department value");
		
	}
	public void destroy() {
		System.out.println("destroy department value");
	}
	

}
