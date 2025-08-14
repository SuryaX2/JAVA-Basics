interface A {
    void show();
}

interface B extends A {
    void show();
}

interface C extends A {
    void show();
}

class D implements B, C {
    public void show() {
        System.out.println("Diamond Problem Solved");
    }
}

public class Diamond {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
