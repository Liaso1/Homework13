import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (M): ");
        int m = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        int[][] transMatrix = new int[n][m];

        System.out.println("Введіть елементи матриці: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Транспонована матриця: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
