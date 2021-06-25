package sp13hw.genres;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
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
