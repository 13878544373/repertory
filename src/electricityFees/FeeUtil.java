package electricityFees;

public class FeeUtil {
	public static void main(String[] args) {
		Season s=new Summer();
		double fee=s.calcFee(125);
		System.out.println("夏天费用是："+fee);
		s=new Winter();
		double fee1=s.calcFee(125);
		System.out.println("冬天费用是："+fee1);
	}
	public static double fee(Season s,int i) {
		return s.calcFee(i);
	}
}
