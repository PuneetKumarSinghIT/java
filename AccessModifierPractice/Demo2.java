package mypack1;

/* Trying to create a new class within the same package.
* It will help to understand accesses allowed for
* non-sub class within the package.
* according to knowledge only provate will not be allowed. 
*/
public class Demo2
{
	Demo1 d1 = new Demo1();
	
	public void show()
	{
		System.out.println("Default variable a = "+d1.a);
		/*
		* D:\EducationCareer\java\AccessModifierPractice>javac -d . Demo2.java
		* Demo2.java:15: error: b has private access in Demo1
        *        System.out.println("Private variable b = "+d1.b);
        *                                                     ^
		* 1 error
		*/
		//System.out.println("Private variable b = "+d1.b);
		System.out.println("Protected variable c = "+d1.c);
		System.out.println("Public variable d = "+d1.d);
	}
}
