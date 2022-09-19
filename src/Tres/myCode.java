package Tres;

import java.util.Scanner;

class myCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        isValid(length);
        int[] arr = new int[length];

        input.nextLine();
        String valores = input.nextLine();
        String[] all = valores.split(" ");
        int qtdValores = all.length;

        for (int i = 0; i < qtdValores; i++) {
            arr[i] = Integer.parseInt(all[i]);
            isValid(arr[i]);
        }

        int menor = (int) Math.pow(10, 5) + 1;
        for (int j : arr)
            if (j < menor)
                menor = j;

        int ocorrencias = 0;
        for (int k : arr)
            if (k == menor)
                ocorrencias++;

        System.out.println(ocorrencias);
    }

    private static void isValid(int n) {
        if (n < 1 || n > (int) Math.pow(10, 5) + 1) {
            System.out.println(
                    "Entrada de tamanho inválido.\nApenas valores entre 1 e 10^5 são permitidos.\nFavor reiniciar o programa.");
            System.exit(0);
        }
    }
}
