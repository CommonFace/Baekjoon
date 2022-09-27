import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, total, max;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int[] arr = {A, B, C};
        int[] arrDistinct = Arrays.stream(arr).distinct().toArray();

        if (arrDistinct.length == 1) {
            total = 10000 + A * 1000;
        } else if (arrDistinct.length == 2) {
            if (A == B && B != C) {
                total = 1000 + A * 100;
            } else if (A == C && A != B) {
                total = 1000 + A * 100;
            } else {
                total = 1000 + B * 100;
            }
        } else {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            total = 100 * max;
        }
        System.out.println(total);

    }
}