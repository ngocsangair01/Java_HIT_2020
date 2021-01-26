package Ball;

public class Ball {
    private float x;
    private float y;
    private int redius;
    private float xDelta;
    private float yDelta;

    public Ball() {
    }

    public Ball(float x, float y, int redius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.redius = redius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", redius=" + redius +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflexHorizontal(){
        xDelta = -xDelta;
    }
    public void relexVertical(){
        yDelta = - yDelta;
    }
}
