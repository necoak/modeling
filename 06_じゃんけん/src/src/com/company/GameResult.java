package com.company;

public enum GameResult {
    WIN("勝ち"),
    LOSE("負け"),
    DRAW("あいこ");

    private String wamei;
    private GameResult(String wamei){
        this.wamei = wamei;
    }

    @Override
    public String toString() {
        return this.wamei;
    }
}
