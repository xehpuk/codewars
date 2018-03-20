import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadedCounting {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int THREAD_COUNT = 3;
    
    public static void countInThreads(final Counter counter) {
        final List<BlockingQueue<Integer>> queues = new ArrayList<>(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            queues.add(new ArrayBlockingQueue<>(1));
        }
        final List<Thread> threads = new ArrayList<>(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            final int j = i;
            final Thread thread = new Thread(() -> {
                while (true) {
                    try {
                        final int k = queues.get(j).take();
                        if (k <= MAX) {
                            counter.count(k);
                        }
                        if (k < MAX + THREAD_COUNT) {
                            queues.get((j + 1) % THREAD_COUNT).put(k + 1);
                        }
                        if (k >= MAX) {
                            break;
                        }
                    } catch (final InterruptedException ex) {}
                }
            }, String.format("Thread-%d", j + 1));
            threads.add(thread);
            thread.start();
        }
        queues.get(0).add(MIN);
        for (final Thread thread : threads) {
            try {
                thread.join();
            } catch (final InterruptedException ex) {}
        }
    }
}