package vn.nvanhuong.jsf_myfaces.wizard;

public enum StepIndicator {
	ADDRESS(0),
	PERSON(1),
	CONFIRM(2),
	UNKNOWN(-1);
	
	private int index;

	private StepIndicator(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public static StepIndicator getIndicatorByIndex(Integer currentIndex) {
		for(StepIndicator indicator: StepIndicator.values()){
			if(indicator.getIndex() == currentIndex){
				return indicator;
			}
		}
		return UNKNOWN;
	}
}
