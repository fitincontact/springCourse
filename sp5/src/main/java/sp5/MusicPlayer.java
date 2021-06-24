package sp3;

public class MusicPlayer {
    private Music music;

    MusicPlayer(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println("Now play: "+music.getSong());
    }
}
