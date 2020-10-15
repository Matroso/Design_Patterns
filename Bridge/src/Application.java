public class Application {
    public static void main(String[] args) {
        Device tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();

        Device radio = new Radio();
        AdvancedRemote advRemote = new AdvancedRemote(radio);
        advRemote.mute();
    }
}
