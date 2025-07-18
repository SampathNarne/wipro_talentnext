class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird pecks grains.");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps in its nest.");
    }
    //Unique Method of Bird
    void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object of Animal class
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("-----");

        // Object of Bird class
        Bird bird = new Bird();
        bird.eat();    // Overridden method
        bird.sleep();  // Overridden method
        bird.fly();    // Unique method of Bird
    }
}
