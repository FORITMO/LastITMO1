package practice7;
public class AirPlan {
    private final Wing wing;

    public AirPlan(int weight) {
        this.wing = new Wing(weight);
    }

    private class Wing {
        private final int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    public void showWeight() {
        System.out.println("Wing weight: " + wing.getWeight());
    }

    public static void main(String[] args) {
        AirPlan plane1 = new AirPlan(12);
        AirPlan plane2 = new AirPlan(13);
        plane1.showWeight();
        plane2.showWeight();
    }
}
