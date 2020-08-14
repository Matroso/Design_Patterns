public class GreenFactory implements Factory {
    @Override
    public Cube getCube() {
        return new GreenCube();
    }

    @Override
    public Rounde getRounde() {
        return new GreenRound();
    }
}
