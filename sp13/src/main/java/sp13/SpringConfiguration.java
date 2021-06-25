package sp13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("sp13")
@PropertySource("classpath:musicPlayer13.properties")
public class SpringConfiguration {


    //delete all @Component and @Autowired
//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(classicalMusic(), rockMusic());
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }

}
