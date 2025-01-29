package practice10;


import java.util.ArrayList;

public class Multi {
    private static void tenThread() {

        for (int i = 0; i <= 10; i++) {
            int count = i;
            new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.printf("Поток: %d число: %d\n", count, j);
                }
            }).start();
        }
    }

    private static void statusThread() {

        Thread thread = new BigThread();

        System.out.printf("Статус потока: %s\n", thread.getState());
        thread.start();
        System.out.printf("Статус потока: %s\n", thread.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Статус потока: %s\n", thread.getState());


    }

   /* private static void nameThread() {

        Object o = new Object();
        try {
            Thread thread1 = new SubClass(o);
            Thread thread2 = new SubClass(o);

            thread1.start();
            thread2.start();

            Thread.sleep(10000);


            thread1.interrupt();
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

    }*/

    public static void main(String[] args) {
        //   tenThread();
        //  statusThread();
        // Counter.incrementCounter();
        // nameThread();

        Counter counter = new Counter();
        try {
            ArrayList<Thread> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                Thread thread = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                });
                list.add(thread);
                thread.start();

            }

            for (Thread thread : list) {
                thread.join();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());

    }
}
