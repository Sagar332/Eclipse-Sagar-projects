package com.SpringCore.lifecycle;
import javax.annotation.PostConstruct;

public class Example {
	
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override

	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	public void start() {
		System.out.println("Subject start");
	}
	
	public void end()
	{
		System.out.println("subject end");
	}

}
