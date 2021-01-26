package Time;

public class MainTime {
    public static void main(String[] args) {
        Time x = new Time(12,12,12);
        System.out.println(x.nextSecond());
        System.out.println(x.previousSecond());
    }
}
