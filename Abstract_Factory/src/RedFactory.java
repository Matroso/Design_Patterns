public class RedFactory implements Factory {
    @Override
    public Cube getCube() {
        return new RedCube();
    }

    @Override
    public Rounde getRounde() {
        return new RedRounde();
    }
}
