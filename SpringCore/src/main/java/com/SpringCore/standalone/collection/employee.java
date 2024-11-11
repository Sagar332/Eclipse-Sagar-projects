package com.SpringCore.standalone.collection;

import java.util.List;

public class employee {
	
	private List<String> Ename;

	@Override
	public String toString() {
		return "employee [Ename=" + Ename + "]";
	}

	public employee(List<String> ename) {
		super();
		Ename = ename;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public List<String> getEname() {
		return Ename;
	}

	public void setEname(List<String> ename) {
		Ename = ename;
	}

}
