package sp6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext6.xml");

        MusicPlayer player1 = context.getBean("player", MusicPlayer.class);
        player1.play();

        System.out.println(player1.getName());

        context.close();
    }

}