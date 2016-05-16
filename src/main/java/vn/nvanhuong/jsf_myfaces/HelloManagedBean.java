package vn.nvanhuong.jsf_myfaces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloBean")
public class HelloManagedBean {
	private String greeting;
	private String name;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
