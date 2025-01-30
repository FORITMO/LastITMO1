package practice10;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Last {
    public static void main(String[] args) {

        Counter counter = new Counter();

            CountDownLatch latch = new CountDownLatch(100);

          for(int i = 0; i <100; i++) {
              new Thread(() -> {
                  for (int j = 0; j < 1000; j++) {
                      counter.increment();
                  }
                  latch.countDown();
              }).start();
          }

             try {
                 latch.await();

            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());



        }


    }




