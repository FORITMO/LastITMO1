package practice6;

public class BankEmployee extends Human{
    private String bankName;
    public BankEmployee(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }


    @Override
    public void printAll() {

    }

    public static void main(String[] args) {

    }
}
