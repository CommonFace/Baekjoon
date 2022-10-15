import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int def = number;
        int cycle = 0;

        while (true) {
            if (number == 0) {
                cycle = 1;
                break;
            } else {
                if (((number / 10) + (number % 10)) >= 10) {
                    number = (number % 10) * 10 + ((number / 10) + (number % 10) - 10);
                    cycle++;
                    if (def == number) {
                        break;
                    }
                } else if (((number / 10) + (number % 10)) < 10) {
                    number = (number % 10) * 10 + (number / 10) + (number % 10);
                    cycle++;
                    if (def == number) {
                        break;
                    }
                }
            }
        }
        scanner.close();
        System.out.println(cycle);
    }
}