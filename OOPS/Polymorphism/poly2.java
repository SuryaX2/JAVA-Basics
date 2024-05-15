class GradeCard {
    String name;
    double m1, m2, m3, m4, m5;
    GradeCard(String name, double m1, double m2, double m3, double m4, double m5) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }
    void show() {
        System.out.println(name + "'s GradeCard:");
        System.out.println("CS:" + m1 + "\nHSMC:" + m2 + "\nOS:" + m3 + "\nCOA:" + m4 + "\nCHEM:" + m5);
    }
}
class NssMarks extends GradeCard {
    double nss;
    NssMarks(String name, double m1, double m2, double m3, double m4, double m5, double nss) {
        super(name, m1, m2, m3, m4, m5);
        this.nss = nss;
    }
    void show() {
        System.out.println(name + "'s GradeCard:");
        System.out.println("CS:" + m1 + "\nHSMC:" + m2 + "\nOS:" + m3 + "\nCOA:" + m4 + "\nCHEM:" + m5 + "\nNSS:" + nss);
    }
}
public class poly2 {
    public static void main(String[] args) {
        GradeCard c = new GradeCard("Student 1",80, 75, 90, 65, 85);
        c.show();
        GradeCard c1 =new NssMarks("Student2", 70, 89, 78, 85,96, 10);
        c1.show();
    }
}
