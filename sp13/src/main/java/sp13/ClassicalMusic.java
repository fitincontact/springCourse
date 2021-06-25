package sp13;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "play classic";
    }

    @Override
    @PostConstruct
    public void init() {
        System.out.println("init ClassicalMusic");
    }

    @Override
    @PreDestroy
    public void destroy() {
        System.out.println("destroy ClassicalMusic");
    }
}
