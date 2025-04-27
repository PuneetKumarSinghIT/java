package mypack1;

/* Example to understand inheritance accessable
* modifiers within the package.
* As studied only private variable will not be accessible.
*/
public class Demo3 extends Demo1
{
	public void showAgain()
	{
		System.out.println("Default variable a = "+a);
		/*
		* D:\EducationCareer\java\AccessModifierPractice>javac -d . Demo3.java
		* Demo3.java:12: error: b has private access in Demo1
        *        System.out.println("Private variable b = "+b);
        *                                                   ^
		* 1 error
		*/
		/* Hence commenting out private variable
		*/
		//System.out.println("Private variable b = "+b);
		System.out.println("Protected variable c = "+c);
		System.out.println("Public variable d = "+d);
	}
}
