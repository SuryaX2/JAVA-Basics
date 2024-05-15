package OOPS.Polymorphism;
class Grandparent {
    double money = 1000000;    
    void show() {
        System.out.println("Grandparent's money: " + money);
    }
}
class Parent extends Grandparent {
    double parentMoney;
    void show() {
        super.show();
        parentMoney = money * 0.5;
        System.out.println("Parent's money:" + parentMoney);
    }
}
class Child extends Parent {
    double childMoney;
    void show() {
        super.show();
        childMoney = parentMoney * 0.5;
        System.out.println("Grandson money: " + childMoney);
    }
}
public class poly1 {
    public static void main(String[] args) {
        Grandparent c = new Child();
        c.show();
    }
}
