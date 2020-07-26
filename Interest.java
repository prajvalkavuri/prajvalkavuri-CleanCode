public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rateOfInterest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double TimePeriod = sc.nextDouble();
		
		Computation com = new Computation(principal, rateOfInterest, TimePeriod);
		
		System.out.format("%s",
				"1)Calculating Simple Interest 2)Calculating Compound Interest");
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.format("%s",String.valueOf(com.CalculateSimpleInterest()));
			break;
		case 2:
			System.out.format("%s",String.valueOf(com.calculateCompoundInterest()));
			break;

		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
