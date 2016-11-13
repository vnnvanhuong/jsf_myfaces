package vn.nvanhuong.jsf_myfaces.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "data")
@ViewScoped
public class MyData implements Serializable{
	private static final long serialVersionUID = -654601189797846209L;
	
	private Integer currentIndex;
	private String content;

	public Integer getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
