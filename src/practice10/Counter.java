package practice10;

import java.util.ArrayList;

class Counter {


    int count;

    public synchronized void increment() {

        count++;
    }
    public int getCount() {
        return count;
    }

    /*static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void incrementCounter() {
        try {
            ArrayList<Thread> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                Thread thread = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        Counter.increment();
                    }
                });
                list.add(thread);
                thread.start();

            }

            for (Thread thread : list) {
                thread.join();
            }

            System.out.printf(String.valueOf(Counter.getCount()));
        } catch (InterruptedException error) {
            System.out.println(error.getMessage());
        }
    }*/
}


