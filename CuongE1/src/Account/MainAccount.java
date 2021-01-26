package Account;

public class MainAccount {
    public static void main(String[] args) {
        Account x = new Account("1","Cuong",120);
        x.credit(120);
        x.debit(120);
    }
}
