package Seis;

/*
 * Unable to solve effectively
 * i.e. works, but not as intended, jumps more than necessary...
 */

import java.util.Scanner;

class myCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First Line
        int length = input.nextInt();
        input.nextLine();
        isValid(length);

        // Second Line
        String[] maxJump = input.nextLine().split(" ");
        int[] platforms = new int[maxJump.length];
        for (int i = 0; i < maxJump.length; i++) {
            platforms[i] = Integer.parseInt(maxJump[i]);
        }
        isValid(platforms);

        int i = 0;
        int jumps = 0;
        boolean madeIt = false;
        while (!madeIt) {
            int available = platforms[i];
            int tillEnd = platforms.length - 1 - i;
            if (available >= tillEnd) {
                jumps += available - tillEnd;
                madeIt = true;
            } else {
                jumps += available;
                i = jumps;
            }
        }

        System.out.println(jumps);
    }

    private static void isValid(int n) {
        if (n < 1 || n > (int) Math.pow(10, 4) + 1) {
            System.out.println(
                    "Entrada de tamanho inválido.\nApenas valores entre 1 e 10^4 são permitidos.\nFavor reiniciar o programa.");
            System.exit(0);
        }
    }

    private static void isValid(int[] n) {
        for (int i : n)
            if (i < 0 || i > 1000) {
                System.out.println(
                        "Entrada de tamanho inválido.\nApenas valores entre 0 e 1000 são permitidos.\nFavor reiniciar o programa.");
                System.exit(0);
            }
    }
}