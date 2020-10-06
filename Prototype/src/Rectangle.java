public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Shape clone(){
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
