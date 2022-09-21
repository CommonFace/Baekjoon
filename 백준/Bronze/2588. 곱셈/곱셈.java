import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String BToString = String.valueOf(B);
        char[] BNumber = BToString.toCharArray();

        for (int i = 0; i < BNumber.length; i++) {
            int BInt = Integer.parseInt(String.valueOf(BNumber[2-i]));
            System.out.println(A * BInt);
        }
        System.out.println(A * B);
    }
}