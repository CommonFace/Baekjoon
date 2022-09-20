import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int q = scanner.nextInt();
        int l = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.printf("%d %d %d %d %d %d",
                1-k, 1-q, 2-l, 2-b, 2-n, 8-p);
    }
}