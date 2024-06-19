class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
