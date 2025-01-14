package practice6;

public class NeGlavniy extends Glavniy{


    public NeGlavniy(String name) {
        super(name);
    }

    @Override
    public  String getName(){
        System.out.println(name);
        return name;
    }


    public  void print(){
        System.out.println(super.dec);
    }

    public static void main(String[] args) {
        NeGlavniy x = new NeGlavniy("test");
        x.print();
        x.getName();
    }
}
