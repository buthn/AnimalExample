public abstract class Animal {
    public abstract void eat();
    public abstract void makeSound();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog eat meat and plant-based foods");
    }

    @Override
    public void makeSound() {
        System.out.println("woof or Bark");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cats can eat cooked meat (i.e., beef, turkey, chicken) " +
                "\n and cooked and de-boned fish (like tuna).");
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}

class Bird extends Animal{

    @Override
    public void eat() {
        System.out.println("Some eat seeds,berries, fruit, insects,");
    }

    @Override
    public void makeSound() {
        System.out.println("tweet, twitter, cheep, and warble");
    }
}
