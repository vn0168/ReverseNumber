package Day6;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter value N: ");
            int N = scanner.nextInt();

            System.out.print("Fibonacci Series up to " + N + " terms: ");
            for (int i = 0; i < N; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

    }
