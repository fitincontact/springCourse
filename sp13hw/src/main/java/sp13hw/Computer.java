package sp13hw;

public class Computer {
    private long id;
    private final MusicPlayer player;

    public Computer(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public String toString() {
        player.play();
        return "COMP id = " + id;
    }

}
