class Keyboard {
    int keys = 9;
    String color;

    public void pressed() {
        System.out.println("Signal sent");
    }

    public void throwIt() {
        System.out.println("Throwing it");
        keys--;
    }
}

class Demo {
    public static void main(String[] args) {

        Keyboard obj;
        obj = new Keyboard();

        obj.throwIt();
        obj.pressed();

        Keyboard obj2;
        obj2 = new Keyboard();

        obj2.throwIt();

        System.out.println(obj.keys);
    }
}