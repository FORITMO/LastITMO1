package practice6;

public abstract class Human {
    protected String name;
    protected String surName;

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }

    public static String getName(String name){
        return name;
    }
    public static String getSurname(String surName){
        return surName;
    }

    public abstract void printAll();

    public static void main(String[] args) {

    }
}
