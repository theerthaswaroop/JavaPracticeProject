interface Animal {
    public void walk();
}

interface Herbivore {

}

interface Carnivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Herbivore");
    }
}

class Tiger implements Animal, Carnivore {
    public void walk() {
        System.out.println("Carnivore");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}