import java.util.ArrayList;

public class Application {
    private ArrayList<Shape> shapes;// = new ArrayList<Shape>();
    private ArrayList<Shape> shapesCopy = new ArrayList<Shape>();
    public Application() {
        Circle circle = new Circle(10, 10, "red", 20);
        shapes = new ArrayList<Shape>();
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle(10,20,"green",100,2);
        shapes.add(rectangle);
    }

    public void businessLogic(){
        for (Shape s:shapes) {
            shapesCopy.add(s.clone());
        }

    }

    public void show(){
        System.out.println(shapesCopy.toString());
    }

}
