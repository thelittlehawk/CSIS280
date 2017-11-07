package ba.edu.ssst.week05.diceboard;

public class DiceRoll {

    private int diceA;

    private int diceB;

    public DiceRoll(int diceA, int diceB) {
        this.diceA = diceA;
        this.diceB = diceB;
    }

    public int getDiceA() {
        return diceA;
    }

    public int getDiceB() {
        return diceB;
    }

    public int sum() {
        return this.diceA + this.diceB;
    }
}
