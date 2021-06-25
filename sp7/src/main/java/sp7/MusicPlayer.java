package sp7;

public class MusicPlayer {
    private Music music;

    MusicPlayer(Music music){
        this.music = music;
    }

    private String name ;
    private long value;

    public MusicPlayer() {
    }

    public void play(){
        System.out.println("Now play: "+music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
