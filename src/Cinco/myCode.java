package Cinco;

/*
 * Unable to solve
 */

import java.util.Scanner;

class myCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First Line
        int length = input.nextInt();
        input.nextLine();

        // Second Line
        String[] elements = input.nextLine().split(" ");

        int[] baus = new int[length];
        for (int i = 0; i < baus.length; i++) {
            baus[i] = Integer.parseInt(elements[i]);
        }

        boolean Break = true;
        int[] movimentos = new int[length];
        for (int i = 0; i < movimentos.length; i++) {
            for (int j = 1; j < baus.length - 1; j++) {
                Break = false;
                if (i == j) {
                    Break = true;
                    break;
                }
                if (baus[j + 1] == 1)
                    movimentos[i]++;
            }
            if (Break)
                break;
            if (baus[1] == 1)
                movimentos[i]++;
            if (baus[baus.length - 1] == 1)
                movimentos[i]++;
        }

        for (int i : movimentos) {
            System.out.print(i + " ");
        }
    }

    private static void isValid(int n) {
        if (n < 1 || n > 2000) {
            System.out.println(
                    "Entrada de tamanho inválido.\nApenas valores entre 1 e 2000 são permitidos.\nFavor reiniciar o programa.");
            System.exit(0);
        }
    }
}