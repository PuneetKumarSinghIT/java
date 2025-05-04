public class Child extends Parent {
    public void doSomething()
    {
        System.out.println("Child class method called");
        super.doSomething(); // Call the parent class method
    }
    /*public string doSomething()
    {
        System.out.println("Child class method called");
        super.doSomething(); // Call the parent class method
    }*/

    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.doSomething(); // Calls Parent class method
        System.out.println("-----------------");
        // Parent c = new Child();
        // c.doSomething(); // Calls Child class method
        System.out.println("-----------------");
        Child child = new Child();
        child.doSomething(); // Calls Child class method
    }
    
}
