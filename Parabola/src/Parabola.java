import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Parabola extends JFrame {
public Parabola(String g){
	super(g);
	}
	public static class GraphPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		//set distances of axis
		g.drawLine(50,200,350,200);
		g.drawString("x",360,200);
		g.drawLine(200, 0, 200, 300);
		g.drawString("y", 200, 310);
		//draw paranola
		Polygon p = new Polygon();
		double scaleFactor=0.1;
		for(int x=-100;x<=100;x++){
		p.addPoint(x+200,200-(int)(scaleFactor*x*x));
		
		}	
		//draw outline defined by polygon
		g.drawPolygon(p);
		}
	}
}