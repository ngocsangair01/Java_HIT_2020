package Bai1_Person;

public class Balance extends Person {
    private int balance;

    public Balance() {
    }

    public Balance(int balance) {
        this.balance = balance;
    }

    public Balance(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void Display() {
        System.out.println("Customer Name: "+super.getName());
        System.out.println("Customer Address"+super.getAddress());
        System.out.println("Balance of customer: "+balance);
    }
}
