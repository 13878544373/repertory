package electricityFees;

public class Winter extends Season{

	@Override
	public double calcFee(int i) {
		double fee=(i+20)*0.49;
		return fee;
	}

}
