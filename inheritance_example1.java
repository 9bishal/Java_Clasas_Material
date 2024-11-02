class animal{
    String name;
    void makesound(){
        System.out.println("Making Sound@!!");
    }
}

class dog extends animal{
    String breed;
    void bark(){
        System.out.println(name+" the "+ breed+" Says:Wolf!!" );
    }
}
class inheritance{
    public static void main(String[] args) {
        animal Animal =  new animal();
        Animal.name="gENERIC dOG";
        Animal.makesound();

        dog Dog = new dog();
        Dog.name="Ruddy";
        Dog.breed="Golden Retrives";
        Dog.makesound();
        Dog.bark();

    }
}