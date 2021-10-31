package com.company;

public class Hand {

    private String name;

    private Hand weakerOfMe;
    private Hand strongerOfMe;

    public Hand(String name) {
        this.name = name;
    }

    public void setWeakerOfMe(Hand weakerOfMe) {
        this.weakerOfMe = weakerOfMe;
    }

    public void setStrongerOfMe(Hand strongerOfMe){
        this.strongerOfMe = strongerOfMe;
    }

    public GameResult getHantei(Hand versusHand) {
        if (versusHand.equals(this)) {
            return GameResult.DRAW;
        }else if (versusHand.equals(weakerOfMe)) {
            return GameResult.WIN;
        } else{
            return GameResult.LOSE;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
