package sp8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext8.xml");

        ClassicalMusic classic1 = context.getBean("classic", ClassicalMusic.class);

        System.out.println(classic1.getSong());

        //scope="prototype"
        ClassicalMusic classic2 = context.getBean("classic", ClassicalMusic.class);

        System.out.println(classic2.getSong());

        context.close();
    }
}