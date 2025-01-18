package practice6;

import java.util.Scanner;

public abstract class Glavniy {
    protected String name;
    public Glavniy(String name){
        this.name = name;
    }
    Scanner scanner = new Scanner(System.in);
    protected int dec = scanner.nextInt();


    public abstract void getAge();
    // public abstract String getName();



}
