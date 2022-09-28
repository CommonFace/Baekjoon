import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int number = scanner.nextInt();
        int[] A = new int[number];
        int[] B = new int[number];

        for (int i = 0; i < number; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < number; i++) {
            int sum = A[i] * B[i];
            total += sum;
        }

        if (total == money) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}