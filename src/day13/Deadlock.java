package day13;

public class Deadlock {

        public static void main(String[] args) {
            final Object resource1 = new Object();
            final Object resource2 = new Object();

            // Thread 1
            Thread thread1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println("Thread 1 acquired resource 1.");

                    try {
                        Thread.sleep(100);  // Adding a small delay for demonstration purposes
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 acquired resource 2.");
                    }
                }
            });

            // Thread 2
            Thread thread2 = new Thread(() -> {
                synchronized (resource2) {
                    System.out.println("Thread 2 acquired resource 2.");

                    try {
                        Thread.sleep(100);  // Adding a small delay for demonstration purposes
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2 acquired resource 1.");
                    }
                }
            });

            // Start the threads
            thread1.start();
            thread2.start();
        }
    }

