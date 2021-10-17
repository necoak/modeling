package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JudgeGame {

    public static void judge(List<Player> players){

        List<Hand> allTypeOfHands = HandManager.getAllHands();
        Map<Hand, GameResult> handResults = new HashMap<>();

        List<Hand> appearsHands = new ArrayList<>();

        List<Hand> playersHands = new ArrayList<>();
        for (Player player : players) {
            playersHands.add(player.getHand());

            if (!appearsHands.contains(player.getHand())){
                appearsHands.add(player.getHand());
            }
        }

        if ((appearsHands.size() == allTypeOfHands.size()) ||
                (appearsHands.size() == 1)) {
            for (Player player : players) {
                player.setGameResult(GameResult.DRAW);
            }
        } else{
            for (Integer indx = 1; indx < appearsHands.size(); indx++) {
                Hand hand0 = appearsHands.get(indx-1);
                Hand hand1 = appearsHands.get(indx);

                handResults.put(hand0, hand0.getHantei(hand1));
                handResults.put(hand1, hand1.getHantei(hand0));
            }

            for (Player player : players) {
                player.setGameResult(handResults.get(player.getHand()));
            }
        }



    }
}
