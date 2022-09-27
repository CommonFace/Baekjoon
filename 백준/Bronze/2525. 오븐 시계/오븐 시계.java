import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        int H, M;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int APlus = 0;
        int BPlus = 0;

        if (C > 60) {
            APlus = C / 60;
            BPlus = C % 60;
        } else {
            APlus = 0;
            BPlus = C;
        }

        if (B + BPlus >= 60) {
            APlus = APlus + 1;
            if (A + APlus >= 24) {
                H = A + APlus - 24;
            } else {
                H = A + APlus;
            }
            M = B + BPlus - 60;
        } else {
            M = B + BPlus;
            if (A + APlus >= 24) {
                H = A + APlus - 24;
            } else {
                H = A + APlus;
            }
        }
        System.out.println(H + " " + M);

    }
}