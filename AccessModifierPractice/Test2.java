import mypack1.Demo2;
import mypack1.Demo3;
import mypack2.Demo4;

class Test2
{
	public static void main(String [] args)
	{
		Demo2 d = new Demo2();
		System.out.println("Result of Demo2 class");
		d.show();
		Demo3 d1 = new Demo3();
		System.out.println("Result of Demo3 class");
		d1.showAgain();
		Demo4 d2 = new Demo4();
		System.out.println("Result of Demo4 class");
		d2.displayDemo1Variable();
	}
}