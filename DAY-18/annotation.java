
class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent{
    @Override
    void display(){
        System.out.println("child class");
    }
}
public class annotation {
    public static void main(String[] args) {
        parent p=new child();
        p.display();
    }
}
    

