package sp13hw.genres;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "play rnr";
    }

    @Override
    @PostConstruct
    public void init() {
        System.out.println("init RockMusic");
    }

    @Override
    @PreDestroy
    public void destroy() {
        System.out.println("destroy RockMusic");
    }
}
