package sp13hw;

import org.springframework.beans.factory.annotation.Value;
import sp13hw.genres.Music;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private final List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private long volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String play() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
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

    public List<Music> getMusicList() {
        return musicList;
    }
}
