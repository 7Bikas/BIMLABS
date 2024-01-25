class Animal {
   public void makeSound() {
      System.out.println("Different animals has different sounds");
   }
}

class Dog extends Animal {
   @Override
   public void makeSound() {
       super.makeSound();
      System.out.println("Bark!");
   }
}

class Cat extends Animal {
   @Override
   public void makeSound() {
      System.out.println("Meow!");
   }
}

public class Qn9 {
   public static void main(String[] args) {
     Dog d1 = new Dog();
     d1.makeSound();
     Cat c1 = new Cat();
     c1.makeSound();
     
   }
}