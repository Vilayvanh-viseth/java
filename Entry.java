public class Entry {
    public static void main(String[] args) {
        Time t = new Time(0, 0, 0);
        t.display();
        t.setTime(23, 59, 58);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(12, 00, 00);
        t.display();
        t.previousSecond();
        t.display();
        t.previousSecond();
        t.display();
        t.previousSecond();
        t.display();
    }
}
