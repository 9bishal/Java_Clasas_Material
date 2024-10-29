class overloadingclass{
    void test(){
        System.out.println("No paraamter!!!!");
    }
    void tes(int d){
        System.out.println("Prameter!!!"+d);
    }
    void test(int a, int b){
        System.out.println("Prameter!!!"+a +","+ b);
    }
//void is never used with return, so the double is used!!
    double test(double c){
        System.out.println("Prameter!!!"+c);
        return c*c*c;
    }
}
public class overloading {
    public static void main(String[] args) {
        overloadingclass show = new overloadingclass();
        show.test();
        show.test(4);
        show.test(5,6);
        double result=show.test(9.09);
        System.out.println("Result "+ result);
    }
}
