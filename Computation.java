class Computation {
	double principal, rateOfInterest, TimePeriod;
	
	Computation(double principal, double rateOfInterest, double TimePeriod){
		this.principal = principal;
		this.rateOfInterest = rateOfInterest;
		this.TimePeriod = TimePeriod;
	}
	
	double calculateCompoundInterest() {
		return (principal * (Math.pow(1 + rateOfInterest / 100, TimePeriod)));
	}

	double CalculateSimpleInterest() {
		return (principal * rateOfInterest * TimePeriod) / 100;
	}

}
