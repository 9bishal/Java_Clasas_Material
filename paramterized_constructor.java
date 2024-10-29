class box1{
    double length;
    double width;
    double height;
    //parametrized constructro
    box1(double l,double w,double h){
        width=w;
        length=l;
        height=h;
    }

    double volume1(){
        return width*length*height;
    }
}

public class paramterized_constructor {
    public static void main(String[] args) {
        box1 mybox2 = new box1(2,4,5);
        double vol1=mybox2.volume1();
        System.out.println("Vloume of a boxs is "+vol1);
    }
}
