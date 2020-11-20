import java.awt.*;
import java.awt.geom.*;

public class circleStone implements stoneShape {
	
	private int x;
	private int y;
	private int width;
	
	public circleStone(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	@Override
	public void draw(Graphics2D g2) {
		int diameter = this.width*2;
		
		Ellipse2D.Double circle = new Ellipse2D.Double(x - width, y - width, diameter, diameter ); 
		g2.fill(circle);
		g2.setColor(Color.black);
		g2.draw(circle);
		
	}
	
	
	

}
