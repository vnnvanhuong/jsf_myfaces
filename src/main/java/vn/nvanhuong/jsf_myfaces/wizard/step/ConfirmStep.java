package vn.nvanhuong.jsf_myfaces.wizard.step;

import vn.nvanhuong.jsf_myfaces.wizard.AbstractStep;
import vn.nvanhuong.jsf_myfaces.wizard.StepIndicator;
import vn.nvanhuong.jsf_myfaces.wizard.StepMessage;

public class ConfirmStep extends AbstractStep{
	
	public ConfirmStep(StepIndicator indicator) {
		this.stepIndicator = indicator;
	}
	
	@Override
	protected void perform(StepMessage message) {
		message.getData().setContent("I am ConfirmStep Step");
	}


}
