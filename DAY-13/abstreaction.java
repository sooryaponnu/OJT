

 abstract class  car{
    car(){
        System.out.println("Owner is john");
    }
    abstract  void brandName();
        void Color(){
            System.out.println("the color of the car is red");
        }
    }

class car1 extends car{
    public  void brandName(){
        System.out.println("the brand name of the car is toyota");
    }
}
 

class car2 extends car{
    public  void brandName(){
        System.out.println("the brand name of the car is toyota");
}
}

public class abstreaction {
    public static void main(String[] args) {
        car cobj =new car1();
        cobj.brandName();
        cobj.Color();

}
}
