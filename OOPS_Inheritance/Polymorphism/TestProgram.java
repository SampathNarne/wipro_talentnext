package wipro_talentnext;

public class TestProgram {
    public static void main(String[] args) {
        // Part 1: Fruit classes
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.eat();
        orange.eat();

        System.out.println();

        // Part 2: Shape polymorphism
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}

