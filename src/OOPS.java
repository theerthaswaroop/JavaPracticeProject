class Shape {
    public void area() {
        System.out.println("displays area");
    }

    ;
}

// Single level Inheritence
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquilateralTriangel extends Triangle {
    public void ara(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

    class Circle extends Shape {
        public void area(int r) {
            System.out.println(3.14 * r * r);
        }
    }
}

