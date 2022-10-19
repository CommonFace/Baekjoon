import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] A = new int[number];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int max = A[0];
        int min = A[0];

        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }
        }

        System.out.println(min + " " + max);

    }
}