public class Main {
    public static void main(String[] args) {


        System.out.println("** Cats Information **");
        Cat cat = new Cat();
        System.out.println("Cat eat: ");
        cat.eat();
        System.out.println("Cat sound: ");
        cat.makeSound();

        System.out.println("\n** Dogs Information **");
        Dog dog = new Dog();
        System.out.println("Dogs eat: ");
        dog.eat();
        System.out.println("Dogs sound: ");
        dog.makeSound();

        System.out.println("\n** Birds Information **");
        Bird bird = new Bird();
        System.out.println("Birds eat: ");
        bird.eat();
        System.out.println("Birds sound: ");
        bird.makeSound();
    }
}