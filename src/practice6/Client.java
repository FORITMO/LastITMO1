package practice6;

public class Client extends Human{
    private String bankName;
    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }


    @Override
    public void printAll() {
        System.out.println(name + " " + surName + " " + bankName);
    }

    public static void main(String[] args) {
        Human client = new Client("Alex", "live", "sber");
        client.printAll();
    }
}
