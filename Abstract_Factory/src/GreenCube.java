import javax.xml.bind.SchemaOutputResolver;

public class GreenCube implements Cube {
    @Override
    public void showColor() {
        System.out.println("Куб зелененький");
    }
}
