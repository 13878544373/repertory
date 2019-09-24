package electricityFees;

public class text {

	public static void main(String[] args) {
		Season s;
		s = new Summer();
		System.out.println("夏天费用是：" + FeeUtil.fee(s, 125));
		s=new Winter();
		System.out.println("冬天费用是：" + FeeUtil.fee(s, 125));

	}

}
