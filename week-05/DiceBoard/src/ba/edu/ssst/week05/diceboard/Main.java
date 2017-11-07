package ba.edu.ssst.week05.diceboard;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dice rolling.");

        DiceRoll[] array = new DiceRoll[100];

        Random random = new Random();
        for (int index = 0 ; index < array.length ; index++) {
            int diceA = random.nextInt(6) + 1;
            int diceB = random.nextInt(6) + 1;
            DiceRoll diceRoll = new DiceRoll(diceA, diceB);
            array[index] = diceRoll;
        }

        int[][] freqArray = new int[6][6];

        for (DiceRoll diceroll: array) {
            int dA = diceroll.getDiceA() - 1;
            int dB = diceroll.getDiceB() - 1;
            freqArray[dA][dB] = freqArray[dA][dB] + 1;
        }

        for (int row = 0 ; row < 6 ; row++) {
            for (int col = 0 ; col < 6 ; col++) {
                System.out.print(freqArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
