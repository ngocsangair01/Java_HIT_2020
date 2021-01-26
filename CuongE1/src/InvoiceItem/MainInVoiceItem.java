package InvoiceItem;

public class MainInVoiceItem {
    public static void main(String[] args) {
        InvoiceItem a = new InvoiceItem("1","abc",1,12);
        System.out.println(a.getTotal());
        System.out.println(a.toString());
    }
}
