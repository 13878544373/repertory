package computer;
/**
 * 外设实现类
 * @author Administrator
 *
 */
public class Test3 extends Brand{
	@Override
	public void peripheral1() {
		super.peripheral1();
		System.out.println("电脑外设是：联想");
	}
	@Override
	public void peripheral2() {
		super.peripheral2();
		System.out.println("电脑外设是：戴尔");
	}


}
