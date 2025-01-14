package practice3;

import java.util.Calendar;

public class Home {

    int floor;
    int year;
    String name;

    public void home(int floor, int year, String name) {
        this.floor = floor;
        this.year = year;
        this.name = name;

    }

    /*  public  String print(){
          return floor + year + name;
      }*/
    public void print1() {
        System.out.println(this.year + " " + this.floor + " " + this.name);
    }

    public int GetAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    //
    public static void main(String[] args) {
        Home home = new Home();
        Home home1 = new Home();
        home1.home(13, 2000, "Zlato");
        home.home(10, 1995, "Zoloto");
        home.print1();
        home1.print1();
        System.out.println(home.GetAge());
        System.out.println(home1.GetAge());
    }
   /* public Home(int floor, int year, String name){
        this.floor = floor;
        this.year = year;
        this.name = name;
    }
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } */
}
