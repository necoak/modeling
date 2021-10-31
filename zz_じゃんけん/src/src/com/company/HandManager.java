package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HandManager {

    static List<Hand> hands = new ArrayList<>();
    static Random random = new Random();

    static {
        // set
        Hand rockHand = new Hand("グー");
        Hand scissorHand = new Hand("チョキ");
        Hand paperHand = new Hand("パー");

        rockHand.setStrongerOfMe(paperHand);
        rockHand.setWeakerOfMe(scissorHand);

        scissorHand.setWeakerOfMe(paperHand);
        scissorHand.setStrongerOfMe(rockHand);

        paperHand.setWeakerOfMe(rockHand);
        paperHand.setStrongerOfMe(scissorHand);

        hands.add(rockHand);
        hands.add(scissorHand);
        hands.add(paperHand);

    }

    public static Hand getRandomHand(){
        return hands.get(random.nextInt(3));
    }

    public static List<Hand> getAllHands() {
        return hands;
    }

}
