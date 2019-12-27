package main.java.DAL;

import main.java.BL.BDice;
import main.java.BL.squares.BPropertySquare;
import org.jfree.data.xy.XYSeries;

import java.util.ArrayList;

/**
 * DPlayer class is data layer for Player concept. It contains data fields and get-set methods
 * to use those values in specific classes in project.
 * @author Muhammed Bera Koç
 * @version 1.0
 */
public class DPlayer {

    private static int totalRounds;
    private int balance, cycleCounter, totalDiceValue, roundValue, currentDiceVal;
    private boolean bankruptFlag, isArrested;
    private BDice playerDice;
    private DPiece.PieceType pieceType;
    private ArrayList<BPropertySquare> propertySquares = new ArrayList<>();
    private XYSeries playerDataset;
    public int roundCounter = 1;
    public DPlayer(DPiece.PieceType pieceType, int balance) {
        playerDice = new BDice();
        this.pieceType = pieceType;
        this.balance = balance;
        this.cycleCounter=0;
        roundValue = 0;
        this.currentDiceVal = 0;
    }

    public int getCurrentDiceVal() {
        return currentDiceVal;
    }

    public void setCurrentDiceVal(int currentDiceVal) {
        this.currentDiceVal = currentDiceVal;
    }

    public void setPieceType(DPiece.PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public int getLocation() {
        return totalDiceValue % 40;
    }

    public int getBalance() {
        return balance;
    }

    public int getCycleCounter() {
        return cycleCounter;
    }

    public int getTotalDiceValue() {
        return totalDiceValue;
    }

    public int getRoundValue() {
        return roundValue;
    }

    public BDice getPlayerDice() {return playerDice; }

    public boolean isBankrupted() {
        return bankruptFlag;
    }

    public DPiece.PieceType getPieceType() {
        return pieceType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCycleCounter(int cycleCounter) {
        this.cycleCounter = cycleCounter;
    }

    public void setTotalDiceValue(int totalDiceValue) {
        this.totalDiceValue = totalDiceValue;
    }

    public void setBankruptFlag(boolean bankruptFlag) {
        this.bankruptFlag = bankruptFlag;
    }

    public void setRoundValue(int roundValue) {
        this.roundValue = roundValue;
    }

    public boolean isArrested() {
        return isArrested;
    }

    public void setArrested(boolean arrested) {
        isArrested = arrested;
    }

    public ArrayList<BPropertySquare> getPropertySquares() {
        return propertySquares;
    }

    public void setPropertySquares(ArrayList<BPropertySquare> propertySquares) {
        this.propertySquares = propertySquares;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public void setTotalRounds(int totalRounds) {
        DPlayer.totalRounds = totalRounds;
    }

    public void addPropertySquares(BPropertySquare square){
        getPropertySquares().add(square);
    }

    public XYSeries getPlayerDataset() {
        return playerDataset;
    }

    public void setPlayerDataset(DPiece.PieceType pieceType) {
        this.playerDataset = new XYSeries(pieceType);
    }
}