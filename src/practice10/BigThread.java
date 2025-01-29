package practice10;

public class BigThread extends Thread {

        @Override
        public void run() {
            /*for (long i = 0; i < 999999999L; i++) {

                if (i % 12345678 == 0) System.out.println("test test");
            }*/
            System.out.printf("Статус потока: %s\n", Thread.currentThread().getState());
        }

    public static void main(String[] args) {

    }
    }

