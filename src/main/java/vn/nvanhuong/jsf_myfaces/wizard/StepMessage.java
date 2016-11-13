package vn.nvanhuong.jsf_myfaces.wizard;

import vn.nvanhuong.jsf_myfaces.model.MyData;

public class StepMessage {
	private StepIndicator stepIndicator;
	private MyData data;
	
	private StepMessage(){}
	
	public StepIndicator getStepIndicator() {
		return stepIndicator;
	}

	private void setStepIndicator(StepIndicator stepIndicator) {
		this.stepIndicator = stepIndicator;
	}
	
	public MyData getData() {
		return data;
	}

	private void setData(MyData data) {
		this.data = data;
	}

	public static class Builder{
		private StepIndicator stepIndicator;
		private MyData data;
		
		private Builder(){}
		
		public static Builder createInstance(){
			return new Builder();
		}

		public Builder setStepIndicator(StepIndicator stepIndicator) {
			this.stepIndicator = stepIndicator;
			return this;
		}
		
		public Builder setData(MyData data) {
			this.data = data;
			return this;
		}

		public StepMessage build(){
			StepMessage result = new StepMessage();
			result.setStepIndicator(stepIndicator);
			result.setData(data);
			return result;
		}
		
	}
	
}
