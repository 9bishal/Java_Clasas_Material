class A{
    int i, j;
    void showij(){
        System.out.println("i and j is: "+i+" "+j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("K is: "+k);
    }
    void sum(){
        System.out.println("The sum of i, j and k is:"+(i+j+k));
    }
}
public class inheritance_example2 {
    public static void main(String[] args) {
        A superclass =  new A();
        B subclass =  new B();
        superclass.i=9;
        superclass.j=10;
        System.out.println("The conitents of claass A is: ");
        superclass.showij();


        subclass.k=8;
        subclass.i=8;
        subclass.j=8;
        System.out.println("The conitents of claass B is: ");
        subclass.showk();

        // System.out.println("The Sum of i, j and k is: ");
        subclass.sum();
    }
}
