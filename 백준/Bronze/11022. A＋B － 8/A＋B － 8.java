import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caseNumber = scanner.nextInt();
        int[] A = new int[caseNumber];
        int[] B = new int[caseNumber];

        for (int i = 0; i < caseNumber; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < caseNumber; i++) {
            System.out.println("Case #" + (i+1) + ": " + A[i] + " + " + B[i] + " = " + (A[i] + B[i]));
        }

    }
}