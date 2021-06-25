package sp10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring10 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext10.xml");

//        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
//        player1.play();

        Computer  computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }

}