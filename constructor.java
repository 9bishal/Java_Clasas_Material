class box{
    double width;
    double length;
    double breadth;

    //constructor
    box(){
        width=10;
        length=9;
        breadth=3;
    }

    double volume(){
        return width*length*breadth;
    }
}
 public class constructor{
    public static void main(String[] args) {
        box myBox=new box();

        double vol =myBox.volume();
        System.out.println("Vloume of a box is:" +vol);
    }
 }