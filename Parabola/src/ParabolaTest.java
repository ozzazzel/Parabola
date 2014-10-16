
import javax.swing.JFrame;
/**
* @author Oscar
* Draw a parabola in JFrame, the function of this parabola is
* f(x) = x^2. we will be using the Java Graphics class to draw a diagram for the function f(x) = x^ 2 on a GUI component.
*
*/
	public class ParabolaTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//create parabola
			Parabola frame= new Parabola("Parabola");
			frame.setVisible(true);
			frame.setSize(400,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setLocationRelativeTo(frame);
			//add parabola to panel
			Parabola.GraphPanel g= new Parabola.GraphPanel();
			frame.add(g);
	}
}