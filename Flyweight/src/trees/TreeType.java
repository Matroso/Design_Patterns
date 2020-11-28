package trees;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics canvas, int x, int y){
        canvas.setColor(Color.black);
        canvas.fillRect(x - 1, y, 3, 5);
        canvas.setColor(color);
        canvas.fillOval(x - 5, y - 10, 10, 10);
    }
}
