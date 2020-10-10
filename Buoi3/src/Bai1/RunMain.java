package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDue = new Person();
        DoanXinhGai.setName("Họ và tên: Zũ Zăn Doan");
        DoanXinhGai.setGender("Giới tính: Gay");
        DoanXinhGai.setDateOfBirth("Ngày sinh: Khong Biet");
        DoanXinhGai.setHobby("Sở thích: Choi gay");
        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println(DoanXinhGai.getHobby());
        DiepBueDue.setName("Họ và tên:Điệp Thị Đức");
        DiepBueDue.setGender("Giới tính: Less");
        DiepBueDue.setDateOfBirth("Ngày sinh: Khong Biet");
        DiepBueDue.setHobby("Sở thích: Choi less");
        System.out.println(DiepBueDue.getName());
        System.out.println(DiepBueDue.getGender());
        System.out.println(DiepBueDue.getDateOfBirth());
        System.out.println(DiepBueDue.getHobby());
    }

}
