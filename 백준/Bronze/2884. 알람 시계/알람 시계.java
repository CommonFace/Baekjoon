import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H, M;

        H = scanner.nextInt();
        M = scanner.nextInt();

        if (H != 0 && M < 45) {
            System.out.println((H - 1) + " " + (60 + (M - 45)));
        } else if (H == 0 && M < 45) {
            System.out.println(23 + " " + (60 + (M - 45)));
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}