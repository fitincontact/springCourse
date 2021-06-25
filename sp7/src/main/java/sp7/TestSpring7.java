package sp7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext7.xml");

        MusicPlayer player1 = context.getBean("player", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("player", MusicPlayer.class);
        //player1.play();

        player1.setName("DDDDDDDDDD");

        System.out.println(player1.getName());
        System.out.println(player2.getName());

        context.close();
    }

}