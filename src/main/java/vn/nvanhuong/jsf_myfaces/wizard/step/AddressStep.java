package vn.nvanhuong.jsf_myfaces.wizard.step;


import vn.nvanhuong.jsf_myfaces.wizard.AbstractStep;
import vn.nvanhuong.jsf_myfaces.wizard.StepIndicator;
import vn.nvanhuong.jsf_myfaces.wizard.StepMessage;

public class AddressStep extends AbstractStep{
	
	public AddressStep(StepIndicator indicator){
		this.stepIndicator = indicator;
	}
	

	@Override
	protected void perform(StepMessage message) {
		message.getData().setContent("I am Address Step");
	}

}
