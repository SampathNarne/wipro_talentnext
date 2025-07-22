package wipro_talentnext;

class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste);
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange", "Tangy", "Small");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste);
    }
}

