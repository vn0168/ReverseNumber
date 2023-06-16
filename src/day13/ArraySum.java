package day13;

import java.util.Arrays;

public class ArraySum {
        private static int[] array = new int[100];
        private static int[] partialSums = new int[5];

        public static void main(String[] args) throws InterruptedException {
            // Fill the array with values from 1 to 100
            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }

            // Create and start 5 threads to calculate partial sums
            SumCalculator[] sumCalculators = new SumCalculator[5];
            Thread[] threads = new Thread[5];
            for (int i = 0; i < 5; i++) {
                sumCalculators[i] = new SumCalculator(i * 20, (i + 1) * 20);
                threads[i] = new Thread(sumCalculators[i]);
                threads[i].start();
            }

            // Wait for all threads to complete
            for (int i = 0; i < 5; i++) {
                threads[i].join();
            }

            // Combine partial sums to get the final sum
            int finalSum = Arrays.stream(partialSums).sum();
            System.out.println("The sum of elements in the array is: " + finalSum);
        }

        static class SumCalculator implements Runnable {
            private int startIndex;
            private int endIndex;

            public SumCalculator(int startIndex, int endIndex) {
                this.startIndex = startIndex;
                this.endIndex = endIndex;
            }

            @Override
            public void run() {
                int sum = 0;
                for (int i = startIndex; i < endIndex; i++) {
                    sum += array[i];
                }
                partialSums[startIndex / 20] = sum;
            }
        }

    }
