class Car{
    String clr;
    String mdl;
    void display(){
        System.out.println("model: " +mdl+ " , color: " + clr);

    }
}
public class ClassCreate{
    public static void main(String[] args) {
        Car car=new Car();
        car.clr="red";
        car.mdl="Toyoto";
        car.display();
    }
}