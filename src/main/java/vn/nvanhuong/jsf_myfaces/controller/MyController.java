package vn.nvanhuong.jsf_myfaces.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.TabChangeEvent;

import vn.nvanhuong.jsf_myfaces.model.MyData;
import vn.nvanhuong.jsf_myfaces.util.MyUtil;

@ManagedBean(name = "logic")
@ViewScoped
public class MyController {
	
	@ManagedProperty(value="#{data}")
	private MyData data;
	private MyUtil util;
	
	public void onStart(){
		util = MyUtil.forData(data);
		util.initView();
	}

	public void onBack(){
		util.updateActiveTabWhenBack();
		util.performActionListener();
	}
	
	public void onNext(){
		util.updateActiveTabWhenNext();
		util.performActionListener();
	}
	
	public void onSwitchTab(TabChangeEvent event){
		util.performActionListener();
	}
	
	public MyData getData() {
		return data;
	}

	public void setData(MyData data) {
		this.data = data;
	}
}
