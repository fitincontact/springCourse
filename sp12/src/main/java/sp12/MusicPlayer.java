package sp12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //@Autowired
    private Music classicalMusic;
    //@Autowired
    private Music rockMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private long volume;

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
        System.out.println(
                "Now play: " +
                classicalMusic.getSong() + "; "
                + rockMusic.getSong() + "; name = "
                +name + "; volume = "+volume

        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }
}
