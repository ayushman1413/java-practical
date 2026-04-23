class A {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends A {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        A myAnimal = new A();
        A myDog = new Dog();

        myAnimal.makeSound();
        myDog.makeSound();
    }
}