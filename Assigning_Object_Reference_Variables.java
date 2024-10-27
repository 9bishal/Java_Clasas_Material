class box{
    double width;
    double height;
    double breadth;

}

public class Assigning_Object_Reference_Variables{
    public static void main(String[] args){
        box b1 = new box();
        b1.width=9;
        b1.height=9;
        b1.breadth=7;
        System.out.println("before modifying");
        box b2=b1;
        
        System.out.println("After modifying");
        System.out.println("Dimension of box b1 is: "+b2.width + b2.height + b2.breadth);

        b2.width=20;
        // b1=null;
        System.out.println("After modifying");
        System.out.println("Dimension of box b1 is: "+b2.width + b2.height + b2.breadth);
    }
}