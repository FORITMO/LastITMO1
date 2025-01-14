package practice3;

public class Tree {

    private int age;
    private boolean live;
    private String name;

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", live=" + live +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean live) {
        this.age = age;
        this.name = name;
        this.live = live;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(13, "Doob");
        Tree tree2 = new Tree(10, "bereza", true);


    }


}
