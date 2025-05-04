public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentRef = new Child(); // Upcasting
        Child child = new Child();
        

        parent.doSomething(); // Output: Doing something in Parent class.
        parentRef.doSomething(); // Output: Doing something in Child class.
        child.doSomething();  // Output: Doing something in Child class.
    }
}
