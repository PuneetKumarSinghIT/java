public class compilemorphism {
    public void sayHello() {
        System.out.println("Hello from compilemorphism!");
    }
    public void sayHello(String name) {
        System.out.println("Hello, " + name + " from compilemorphism!");
    }
    public void sayHello(char level) {
        System.out.println("Level is " + level + " from compilemorphism!");
    }

    /*
        This is the demonstration of compile time polymorphism. 
        Rules are:
        Method name and return type should be same.
        Parameter list should be different and datatype should be different and order of parameters should be different.
     */
    public static void main(String[] args) {
        compilemorphism obj = new compilemorphism();
        obj.sayHello(); // calling method without parameters
        obj.sayHello("John"); // calling method with String parameter
        obj.sayHello('A'); // calling method with char parameter
    }
}
