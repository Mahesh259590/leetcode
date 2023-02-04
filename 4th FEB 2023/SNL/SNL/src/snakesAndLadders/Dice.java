package snakesAndLadders;
import java.util.*;
public class Dice{
    private int numberOfDice;
    private static int MIN=1;
    Random random;
    public Dice(int numberOfDice){
        random=new Random();
        this.numberOfDice=numberOfDice;
    }
    public int getNumberOfDice(){
        return random.nextInt(bound (this.numberOfDice-MIN)+1)+1;
    }
    private int bound(int i) {
        return 0;
    }
}