import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class shapeIcon implements Icon {
	private stoneShape shape;
    private int width;
    private int height;
    private ArrayList<stoneShape> shapeList;

    /**
     * construc shapeicon
     * @param shapeList an array to store moveable shape
     * @param width shape's width
     * @param height shape's height
     */
    public shapeIcon (ArrayList<stoneShape> shapeList, int width, int height){
        this.shapeList = shapeList;
        this.width = width;
        this.height = height;
    }

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
        for (stoneShape s: shapeList){
            s.draw(g2);
        }
		
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
