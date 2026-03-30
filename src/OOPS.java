class Pen {
    String color;
    String type;//ballpoint;gel

    public void write() {
        System.out.println("Write Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }


}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}


public class OOPS {
    public static void main(String args[]) {
        Pen pen1;
        pen1 = new Pen(); // one way to create an object

        Pen pen2 = new Pen(); // second way to create an object

        pen1.color = "red";
        pen2.color = "black";

        pen2.type = "Gel";

        pen1.write();

        pen2.printColor();
        pen1.printColor();

        Student s1 = new Student();
        s1.age = 24;
        s1.name = "Michael";

        Student s2 = new Student();
        s2.age = 25;
        s2.name = "Kareem";

        s1.printInfo();
        s2.printInfo();


    }
}
