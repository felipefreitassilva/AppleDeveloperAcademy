package Quatro;

import java.util.Scanner;

class myCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First Line
        String[] amountIndex = input.nextLine().split(" ");
        // n
        int amount = Integer.parseInt(amountIndex[0]);
        isValid(amount);
        // k
        int index = Integer.parseInt(amountIndex[1]);
        isOutOfBounds(index, amount);

        // Second Line
        String[] items = input.nextLine().split(" ");
        int[] prices = new int[amount];
        for (int i = 0; i < amount; i++) {
            prices[i] = Integer.parseInt(items[i]);
            isPriceValid(prices[i]);
        }

        // Third Line (d)
        int chargedPrice = input.nextInt();

        int sum = 0;
        for (int i : prices)
            sum += i;
        isChargedAmountValid(chargedPrice, sum);

        int nonConsumedItem = prices[index];
        int duePrice = (sum - nonConsumedItem) / 2;
        int difference = chargedPrice - duePrice;

        if ((difference) == 0)
            System.out.println("Quites");
        else if (difference > 0)
            System.out.println(difference);
        else
            System.out.println("Undercharged");
    }

    private static void isValid(int n) {
        if (n < 2 || n > (int) Math.pow(10, 5) + 1) {
            System.out.println(
                    "Entrada de tamanho inválido.\nApenas valores entre 2 e 10^5 são permitidos.\nFavor reiniciar o programa.");
            System.exit(0);
        }
    }

    private static void isOutOfBounds(int index, int amount) {
        if (index >= amount || index < 0) {
            System.out.println("Este índice não é permitido.\nFavor reinicar o programa");
            System.exit(0);
        }
    }

    private static void isPriceValid(int n) {
        if (n < 0 || n > (int) Math.pow(10, 4) + 1) {
            System.out.println(
                    "Preço inválido.\nApenas valores entre 0 e 10^4 são permitidos.\nFavor reiniciar o programa.");
            System.exit(0);
        }
    }

    private static void isChargedAmountValid(int amount, int sum) {
        if (amount < 0 || amount > sum) {
            System.out.printf(
                    "Preço cobrado exorbitante.%nApenas valores positivos e inferiores ao total (%d) da conta são permitidos.%nFavor reiniciar o programa.%n",
                    sum);
            System.exit(0);
        }
    }
}