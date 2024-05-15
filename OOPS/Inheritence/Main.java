class Couple {
    String name, loc, con;
    double money = 6000000;
    public Couple(String x, String y, String z) {
        name = x;
        loc = y;
        con = z;
    }
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + loc);
        System.out.println("Contact Number: " + con);
        System.out.println("Received Amount: " + money);
        System.out.println();
    }
}
class Son extends Couple {
    Son(String name, String loc, String con) {
        super(name, loc, con);
        money = money*0.2;
    }
}
class Daughter extends Couple {
    Daughter(String name, String loc, String con) {
        super(name, loc, con);
        money = money*0.15;
    }
}
public class Main {
    public static void main(String[] args) {
        Son son1 = new Son("Son1", "City A", "1234567890");
        Son son2 = new Son("Son2", "City B", "0987654321");
        Daughter daughter1 = new Daughter("Daughter1", "City C", "9876543210");
        Daughter daughter2 = new Daughter("Daughter2", "City D", "0123456789");
        System.out.println("Sons:");
        son1.show();
        son2.show();
        System.out.println("Daughters:");
        daughter1.show();
        daughter2.show();
    }
}