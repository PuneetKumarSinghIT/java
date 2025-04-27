package mypack1;

/* By default if we don't provide any access modifier then default 
* modifier will be assigned to a class and will not class to be accessed 
* out of mypack1.
* example of such class name is 
* class Demo1 */

/* Error while trying to access a default type of class
D:\EducationCareer\java\AccessModifierPractice>javac Test.java
Test.java:1: error: Demo1 is not public in mypack1; cannot be accessed from outside package
import mypack1.Demo1;
              ^
Test.java:10: error: cannot access Demo1
                Demo1 d1 = new Demo1();
                ^
  bad source file: .\Demo1.java
    file does not contain class Demo1
    Please remove or make sure it appears in the correct subdirectory of the sourcepath.
2 errors 
*/

/* To correct the default class issue we need to exclusively class as public
* syntax is:
* public class Demo1 
*/
public class Demo1
{
	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public void display()
	{
		System.out.println(a +" "+ b +" "+ c +" "+ d);
	}
}