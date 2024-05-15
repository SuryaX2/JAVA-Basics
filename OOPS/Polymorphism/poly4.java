class Cricket {
    void play(String name) {
        System.out.println("Name: " + name);
    }
    void play(String name, String role) {
        System.out.println("Name: " + name + ", Role: " + role);
    }
    void play(String name, int runs, double avg) {
        System.out.println("Name: " + name + ", Runs: " + runs + ", Avg: " + avg);
    }
    void play(String name, int runs, int wickets, double avg) {
        System.out.println("Name: " + name + "Runs: " + runs + "Wickets: " + wickets + "Avg: " + avg);
    }
    void play(String name, int runs, double batAvg, int wickets, double bowlAvg) {
        System.out.println("Name: " + name + ", BatAvg: " + batAvg + ", BowlAvg: " + bowlAvg);
    }
}
class poly4 {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.play("Virat Kohli");
        c.play("Rohit Sharma", "Batsman");
        c.play("Shikhar Dhawan", 4500, 42.36);
        c.play("Jasprit Bumrah", 200, 122, 25.10);
        c.play("Ravindra Jadeja", 3000, 30.25, 150, 22.45);
    }
}