class parent{
    public int publicvar=1;
    protected int protectedvar=2;
    private int privatevar=3;
    int defaultVar = 4; 

    void display(){
        System.out.println();
        System.out.println();
        System.out.println("Variables of a Parent class are:");
        System.out.println("publicvar "+publicvar);
        System.out.println("protectedvar "+protectedvar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("privatevar "+privatevar);
        System.out.println();
    }
}
class child extends parent{
    void show(){
        System.out.println("Variables of Child class are:");
        System.out.println("Variables of a Parent class are:");
        System.out.println("publicvar "+publicvar);
        System.out.println("protectedvar "+protectedvar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println();
        System.out.println();
        // in this line there will be showing the error,
        //  bcoz the privatevar is private only within a suoer class
        // System.out.println("privatevar "+privatevar);
    }
}

public class MEMBER_ACCESS_AND_INHERITANCE {
    public static void main(String[] args) {
        parent  Parent = new parent();
        Parent.display();
        child Child = new child();
        Child.show();
    }
}
