package vn.nvanhuong.jsf_myfaces.util;

import vn.nvanhuong.jsf_myfaces.model.MyData;
import vn.nvanhuong.jsf_myfaces.wizard.AbstractStep;
import vn.nvanhuong.jsf_myfaces.wizard.StepIndicator;
import vn.nvanhuong.jsf_myfaces.wizard.StepMessage;
import vn.nvanhuong.jsf_myfaces.wizard.step.AddressStep;
import vn.nvanhuong.jsf_myfaces.wizard.step.ConfirmStep;
import vn.nvanhuong.jsf_myfaces.wizard.step.PersonStep;

public class MyUtil {
	private MyData data;
	private AbstractStep stepChain;
	
	private MyUtil(MyData data){
		this.data = data;
	}
	
	public static MyUtil forData(MyData data){
		return new MyUtil(data);
	}
	
	public void initView(){
		stepChain = initStepChain();
		data.setCurrentIndex(StepIndicator.ADDRESS.getIndex());
		this.performActionListener();
	}
	
	private AbstractStep initStepChain() {
		AbstractStep addressStep = new AddressStep(StepIndicator.ADDRESS);
		AbstractStep personStep = new PersonStep(StepIndicator.PERSON);
		AbstractStep confirmStep = new ConfirmStep(StepIndicator.CONFIRM);
		
		addressStep.setNextStep(personStep);
		personStep.setNextStep(confirmStep);
		
		return addressStep;
	}
	
	public void performActionListener() {
		StepMessage message = StepMessage.Builder.createInstance()
									.setData(data)
									.setStepIndicator(StepIndicator.getIndicatorByIndex(data.getCurrentIndex()))
									.build();
		stepChain.performActionListerner(message);
	}

	public void updateActiveTabWhenNext() {
		data.setCurrentIndex(data.getCurrentIndex() + 1);
	}
	
	public void updateActiveTabWhenBack() {
		data.setCurrentIndex(data.getCurrentIndex() - 1);
	}
}
