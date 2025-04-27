package mypack2;
import mypack1.Demo1;

/* As studied only protected and public variables will be accessed by inheriting class
* present in another package.
*/
public class Demo4 extends Demo1
{
	public void displayDemo1Variable()
	{
		/*
		* D:\EducationCareer\java\AccessModifierPractice>javac -d . Demo4.java
		* Demo4.java:11: error: a is not public in Demo1; cannot be accessed from outside package
        *        System.out.println("Default variable a = "+a);
        *                                                   ^
		* Demo4.java:12: error: b has private access in Demo1
        *        System.out.println("Private variable b = "+b);
        *                                                   ^
		* 2 errors
		*/
		// Hence commenting default and private variables of class Demo1
		//System.out.println("Default variable a = "+a);
		//System.out.println("Private variable b = "+b);
		System.out.println("Protected variable c = "+c);
		System.out.println("Public variable d = "+d);
	}
}
