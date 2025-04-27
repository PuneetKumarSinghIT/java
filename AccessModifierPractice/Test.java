import mypack1.Demo1;

class Test
{
	public static void main(String [] args)
	{
		/* command to check if we can access all type of access modifiers
		 * within a class as according to knowledge all access modifiers are 
		 * are accessible within the class.*/
		Demo1 d1 = new Demo1();
		d1.display();
		/* Result is:
		 * D:\EducationCareer\java\AccessModifierPractice>java Test
		 * 10 20 30 40
		*/
		// Trying to access the variable outside the class and will try to 
		// verify the result.
		//System.out.println("Default variable a = "+d1.a);
		//System.out.println("Private variable b = "+d1.b);
		//System.out.println("Protected variable c = "+d1.c);
		// Only public variable is allowed by non-sub class outside the package as studied.
		System.out.println("Public variable d = "+d1.d);
		/*
		* D:\EducationCareer\java\AccessModifierPractice>javac Test.java
		* Test.java:18: error: a is not public in Demo1; cannot be accessed from outside package
        *        System.out.println("Default variable a = "+d1.a);
        *                                                     ^
		* Test.java:19: error: b has private access in Demo1
        *        System.out.println("Private variable b = "+d1.b);
        *                                                     ^
		* Test.java:20: error: c has protected access in Demo1
        *        System.out.println("Protected variable c = "+d1.c);
        *                                                      ^
		* 3 errors
		*/
	}
}