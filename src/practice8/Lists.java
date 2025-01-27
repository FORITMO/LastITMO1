package practice8;

import java.util.*;

public class Lists {

    /*  public static void duplic(){
          List<Object> objects = new ArrayList<>();
          for(int i =0; i < 10; i++){
              for (int j = 2; j<10; j++){
                  objects.add(j);
              }
              objects.add(i);
          }
          System.out.println(objects);
          System.out.println(printUniq(objects));
      } */
    public static <T> Collection<T> printUniq(Collection<T> test) {
        return new HashSet<>(test);
    }

    public static void million() {
        ArrayList<Double> list = new ArrayList<>();
        LinkedList<Double> link = new LinkedList<>();
        final int a = 1000000;
        final int b = 100000;
        for (int i = 0; i < a; i++) {
            list.add(Math.random() * 100);
            link.add(Math.random() * 100);
        }
        long startTime = System.currentTimeMillis();
        for (int y = 0; y < b; y++) {
            list.get((int) Math.random() * 1000000);

        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();

        for (int y = 0; y < b; y++) {
            link.get((int) Math.random() * 1000000);
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void main(String[] args) {
        Lists s = new Lists();
        million();
        //Lists.duplic();
        List<Object> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                objects.add(j);
            }
            objects.add(i);
        }
        System.out.println(objects);
        System.out.println(printUniq(objects));
    }
}
