package sp9;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "play rnr";
    }
}
