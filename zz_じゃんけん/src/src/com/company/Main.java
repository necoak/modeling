package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer numOfPerson = Integer.parseInt(args[0]);

        if (numOfPerson < 2) {
            System.err.println("few player");
        }
        Game.playGame(numOfPerson);

    }
}
