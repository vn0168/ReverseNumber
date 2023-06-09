package Day6;

public class Age {

        public static void main(String[] args) {
            int age = 19; // Example age

            classifyAge(age);
        }

        public static void classifyAge(int age) {
            if (age < 13) {
                System.out.println("Kid");
            } else if (age <= 19) {
                System.out.println("Teen");
            } else {
                System.out.println("Adult");
            }
        }

    }
