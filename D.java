package constructor_Chaining;

public class D extends C{
    D(String hello){
        super("constructor of c with parameter");
        System.out.println(hello);
    }
    D(){
        System.out.println("constructor of class D");
    }
}
