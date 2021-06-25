package sp13hw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sp13hw.config.SpringConfiguration;

public class TestSpring13hw {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }

}