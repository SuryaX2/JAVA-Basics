interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("in show method");
    }
    public void display() {
        System.out.println("in display method");
    }
}
class multiple {
    public static void main(String[] args) {
        A a = new C();
        a.show();
        B a2 = new C();
        a2.display();
    }    
}
