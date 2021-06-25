package sp12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext12.xml");

        Computer  computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }

}