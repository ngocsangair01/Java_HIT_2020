package Ball;

public class MainBall {
    public static void main(String[] args) {
        Ball x =new Ball(12,12,12,12,12);
        x.move();
        x.reflexHorizontal();
        x.relexVertical();
        System.out.println(x.toString());
    }
}
