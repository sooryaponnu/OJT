// Main.java
public class Main {
    public static void main(String[] args) {
      Person person1 = new Person("Ean Craig", 11);
      Person person2 = new Person("Evan Ross", 12);
      System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
      System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
    }
  }
  