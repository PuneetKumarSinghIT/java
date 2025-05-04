public class B extends A{
    private String name;
    private B()
    {
        System.out.println("B constructor called");
    }
    public B(String name)
    {
        this.name=name;
        System.out.println("B constructor called with name: " + this.name);
    }
}
