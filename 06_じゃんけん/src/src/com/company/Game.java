package com.company;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void playGame(int numOfPerson) {

        List<Player> players = new ArrayList<>();

        for (int i=0; i < numOfPerson; i++) {
            players.add(new Player(i));
        }

        JudgeGame.judge(players);

        for (Player player : players){
            System.out.println(player.toString() +" "+  player.getHand() + "" + player.getGameResult());
        }


    }
}
