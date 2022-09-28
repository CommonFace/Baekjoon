import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < A + 1; i++) {
            total = total + i;
        }
        System.out.println(total);

    }
}