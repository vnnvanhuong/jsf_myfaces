package vn.nvanhuong.jsf_myfaces.wizard;

public abstract class AbstractStep{
	protected StepIndicator stepIndicator;
	private AbstractStep nextStep;
	
	public void setNextStep(AbstractStep nextStep) {
		this.nextStep = nextStep;
	}
	
	public void performActionListerner(StepMessage message){
		if(stepIndicator == message.getStepIndicator()){
			perform(message);
		}
		
		if(nextStep != null){
			nextStep.performActionListerner(message);
		}
	}
	
	abstract protected void perform(StepMessage message);
}
