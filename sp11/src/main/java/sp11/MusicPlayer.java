package sp11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //@Autowired
    private Music classicalMusic;
    //@Autowired
    private Music rockMusic;

    @Autowired
    public MusicPlayer(
            @Qualifier("classicalMusic") Music classicalMusic,
            @Qualifier("rockMusic") Music rockMusic
    ) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //@Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    //@Autowired
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public void play() {
        System.out.println("Now play: " + classicalMusic.getSong() + "; "
                + rockMusic.getSong());
    }

}
