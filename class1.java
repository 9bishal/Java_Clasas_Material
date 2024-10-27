class box{
    int width;
    int breadth;
    int height;
};

public class class1 {

    public static void main(String[] arge){
        box myBox = new box();
        myBox.width=9;
        myBox.breadth=9;
        myBox.height=9;
        System.out.println("The width of the box is: "+myBox.width);
        System.out.println("The breadth of the box is: "+myBox.breadth);
        System.out.println("The height of the box is: "+myBox.height);
        double volume=myBox.width*myBox.breadth*myBox.height;
        System.out.println("The volume of the box is: "+volume);

    };
};