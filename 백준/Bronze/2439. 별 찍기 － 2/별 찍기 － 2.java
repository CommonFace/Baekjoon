import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String star = "*";
        String blank = "";

        String[] A = new String[number];
        String[] B = new String[number];

        for (int i = (number - 1); i >= 0; i--) {
            A[i] = blank;
            blank = blank + " ";
        }

        for (int j = 0; j < number; j++) {
            B[j] = star;
            star = star + "*";
        }

        for (int i = 0; i < number; i++) {
            System.out.println(A[i] + B[i]);
        }
    }
}