package electricityFees;

public class Summer extends Season{

	
	public Summer() {
		super();
	}
	@Override
	public double calcFee(int i) {
		double fee=i*0.49;
		return fee;
	}
	

}
