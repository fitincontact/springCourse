package sp5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext5.xml");

        MusicPlayer player1 = context.getBean("player", MusicPlayer.class);
        player1.play();

        context.close();
    }

}