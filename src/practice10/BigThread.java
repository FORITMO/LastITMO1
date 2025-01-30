package practice10;

public class BigThread extends Thread {

        @Override
        public void run() {

            System.out.printf("Статус потока: %s\n", Thread.currentThread().getState());
        }

    public static void main(String[] args) {

    }
    }

