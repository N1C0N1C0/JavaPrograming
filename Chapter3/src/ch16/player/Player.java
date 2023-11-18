package ch16.player;

public class Player {
    public PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel pl) {
        level = pl;
        pl.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
