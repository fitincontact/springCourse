package sp13hw.config;

import org.springframework.context.annotation.*;
import sp13hw.Computer;
import sp13hw.MusicPlayer;
import sp13hw.genres.ClassicalMusic;
import sp13hw.genres.Music;
import sp13hw.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("sp13hw")
@PropertySource("classpath:musicPlayer13.properties")
public class SpringConfiguration {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }


    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
