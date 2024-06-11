interface A {
    void show();
}

class B implements A{
    public void show() {
        System.out.println("Class B");
    } 
}

class C implements A{
    public void show() {
        System.out.println("Class C");
    }
}
class abs {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        A a2 = new C();
        a2.show();
    }
}