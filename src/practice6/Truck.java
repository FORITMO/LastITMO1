package practice6;

public class Truck extends CarNew{
    private int countWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int countWheels, int maxWeight) {
        super(w, m, c, s);
        this.countWheels = countWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int count){
        countWheels = count;
        System.out.println(countWheels);
    }

    public static void main(String[] args) {
        Truck truck = new Truck(1, "d", 'f', 3, 3, 222);

        truck.newWheels(4);

    }
}
