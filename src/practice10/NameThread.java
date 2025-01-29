package practice10;

public class NameThread {
    private volatile int currentThread = 1;
    private final int totalThreads;

    public NameThread(int totalThreads) {
        this.totalThreads = totalThreads;
    }

    public synchronized void printThread(int threadNumber) throws InterruptedException {
        while (true) {
            while (currentThread != threadNumber) {
                wait();
            }

            System.out.println("Thread-" + threadNumber);

            currentThread = (currentThread % totalThreads) + 1;
            notifyAll();
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        NameThread orderedThreads = new NameThread(2);

        for (int i = 1; i <= 2; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                try {
                    orderedThreads.printThread(threadNumber);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }, "Thread-" + i).start();
        }
    }
}
