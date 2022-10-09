import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String ini = "*";

        for (int i = 0; i < number; i++) {
            System.out.println(ini);
            ini = ini + "*";
        }
    }
}