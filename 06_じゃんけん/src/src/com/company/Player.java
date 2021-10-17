package com.company;

public class Player {

    private int playerId;
    private Hand hand;
    private GameResult gameResult;

    public Player(int playerId){
        this.playerId = playerId;
        this.hand = HandManager.getRandomHand();
    }

    public Hand getHand(){
        return this.hand;
    }

    public void setGameResult(GameResult gameResult) {
        this.gameResult = gameResult;
    }

    public GameResult getGameResult(){
        return this.gameResult;
    }

    @Override
    public String toString() {
        return Integer.toString(playerId);
    }
}
