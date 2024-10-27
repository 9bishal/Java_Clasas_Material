class box{
    int width;
    int breadth;
    int height;
    //this is what method mean to say
    void volume(){
        System.out.println("The volume of box is:");
        System.out.println(width*height*breadth);
    };
};


public class java_methods {
    public static void main(String[] args) {
    box b1 = new box();
    b1.width=9;
    b1.height=9;
    b1.breadth=9;
    b1.volume();
    };
};
