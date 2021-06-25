package sp10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //    private Music music;
//
//    MusicPlayer(Music music){
//        this.music = music;
//    }
//
//    public void play(){
//        System.out.println("Now play: "+music.getSong());
//    }
    @Autowired
    private ClassicalMusic classicalMusic;

    //@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    //@Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void play() {
        System.out.println("Now play: " + classicalMusic.getSong());
    }

}
