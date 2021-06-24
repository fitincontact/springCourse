package sp3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        ClassicalMusic classic = context.getBean("classic", ClassicalMusic.class);
        MusicPlayer player1 = new MusicPlayer(classic);
        player1.play();

        RockMusic rock = context.getBean("rock", RockMusic.class);
        MusicPlayer player2 = new MusicPlayer(rock);
        player2.play();

        context.close();
    }

}