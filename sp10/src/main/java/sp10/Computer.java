package sp10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private long id;
    @Autowired
    private MusicPlayer player;

    @Override
    public String toString(){
        player.play();
        return "COMP id = "+id;
    }

}
