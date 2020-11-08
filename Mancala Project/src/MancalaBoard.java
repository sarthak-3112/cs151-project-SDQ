import java.awt.*;
import javax.swing.*;


public class MancalaBoard {
	
	private JFrame frame;
	private JTextField text;
	private JButton style1; // board game style 1
    private JButton style2; // board game style 2

    
    
	public MancalaBoard()
    {
		frame = new JFrame();
		frame.setTitle("Mancala Game");
		frame.setSize(250,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		text = new JTextField(5);
		JLabel label = new JLabel();
		label.setText("Stone Number(3 or 4): ");
		panel1.add(label);
		panel1.add(text);
		
		JPanel panel2 = new JPanel();
		style1 = new JButton("Style 1");
		style2 = new JButton("Style 2");
		panel2.add(style1);
		panel2.add(style2);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);
      
    }
	public static void main(String[] args){
		
        new MancalaBoard();
	}

	
}
