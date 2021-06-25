package sp8;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {
    }

    public static ClassicalMusic newClassicalMusic() {
        System.out.println("newClassicalMusic");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "play classic";
    }

    @Override
    public void doInit() {
        System.out.println("doInit ClassicalMusic");
    }

    @Override
    public void doDestroy() {
        System.out.println("doDestroy ClassicalMusic");
    }
}
