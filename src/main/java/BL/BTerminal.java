package main.java.BL;

import main.java.BL.squares.BSquare;
import main.java.Controller.CTerminal;
import main.java.DAL.DPlayer;

import java.util.ArrayList;

/**
 * <h>BTerminal</h>
 *
 * <p>We use the class to transfer CTerminal print values.</p>
 *
 * @author Salih ÖZYURT
 * @version 1.0
 */
public class BTerminal {

    private CTerminal cTerminal = new CTerminal();

    public void printBeforeRollDice(BPlayer bPlayer) {
        cTerminal.printBeforeRollDice(bPlayer);
    }

    public void printDicesFaces(int[] diceValues, BPlayer bPlayer){
        cTerminal.printDicesFaces(diceValues, bPlayer);
    }

    public void printCard(String nameOfCard){
        cTerminal.printCard(nameOfCard);
    }

    public void printAfterRollDice(BPlayer bPlayer, BSquare bSquare){
        cTerminal.printAfterRollDice(bPlayer, bSquare);
    }

    public void printRentProcess(DPlayer dPlayer, BSquare bSquare){
        cTerminal.printRentProcess(dPlayer,bSquare);
    }

    public void printBuyProcess(BPlayer bPlayer, BSquare bSquare){
        cTerminal.printBuyProcess(bPlayer,bSquare);
    }

    public void printWinnerPlayer(BPlayer bPlayer){ cTerminal.printWinnerPlayer(bPlayer); }

    public void printGameOver(ArrayList eliminatedList){
        cTerminal.printGameOver(eliminatedList);
    }
}

