class box1{
    double length;
    double width;
    double height;
    //parametrized constructro
    box1(double length,double width,double height){
        this.width=width;
        this.length=length;
        this.height=height;
    }

    double volume1(){
        return width*length*height;
    }
}

public class this1{
    public static void main(String[] args) {
        box1 mybox2 = new box1(2,4,5);
        double vol1=mybox2.volume1();
        System.out.println("Vloume of a boxs is "+vol1);
    }
}
