package electricityFees;

public class text {

	public static void main(String[] args) {
		Season s;
		s = new Summer();
		System.out.println("��������ǣ�" + FeeUtil.fee(s, 125));
		s=new Winter();
		System.out.println("��������ǣ�" + FeeUtil.fee(s, 125));

	}

}
