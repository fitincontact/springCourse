package sp8;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "play rnr";
    }


    @Override
    public void doInit() {
        System.out.println("doInit RockMusic");
    }

    @Override
    public void doDestroy() {
        System.out.println("doDestroy RockMusic");
    }
}
