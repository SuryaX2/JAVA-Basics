class GrandParent {
    double money = 1000000;
    String name = "", age = "";
}
class Daughter extends GrandParent {
    void showDaughter() {
        name = "Daughter";
        age = "30";
        System.out.println("\nName : " + name + "\nAge : " + age + "\nMoney : " + ((money * 2) / 3));
    }
}
class GrandDaughter extends Daughter {
    void showGrandDaughter() {
        name = "Grand Daughter";
        age = "15";
        System.out.println("\nName : " + name + "\nAge : " + age + "\nMoney : " + ((money * 1) / 3));
    }
    public static void main(String[] args) {
        GrandDaughter g = new GrandDaughter();
        g.showDaughter();
        g.showGrandDaughter();
    }
}
