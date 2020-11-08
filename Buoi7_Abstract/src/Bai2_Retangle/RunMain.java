package Bai2_Retangle;

public class RunMain {
    public static void main(String[] args) {
        Ishape[] ishapes  = new Ishape[3];
        ishapes[0] = new Rectangle(3.4,5.3);
        ishapes[1] = new Circle(5.5);
        ishapes[2] = new Rectangle(7.4,4.3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Dien tich cua hinh thu "+i+" la: "+ ishapes[i].getArea());
            System.out.println("Chu vi cua hinh thu "+i+" la: "+ ishapes[i].getPrimeter());
        }
    }
}
