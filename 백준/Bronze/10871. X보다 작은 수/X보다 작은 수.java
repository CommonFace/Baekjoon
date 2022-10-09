import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList<>();

        int number = scanner.nextInt();
        int object = scanner.nextInt();
        int[] A = new int[number];

        for (int i = 0; i < number; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < number; i++) {
            if (A[i] < object) {
                arrayList.add(A[i]);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}