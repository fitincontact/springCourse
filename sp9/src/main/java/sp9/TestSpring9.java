package sp9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext9.xml");

        ClassicalMusic classic = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer player1 = new MusicPlayer(classic);
        player1.play();

        RockMusic rock = context.getBean("rock", RockMusic.class);
        MusicPlayer player2 = new MusicPlayer(rock);
        player2.play();

        context.close();
    }

}