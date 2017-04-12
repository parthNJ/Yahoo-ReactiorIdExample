import javax.swing.JFrame;

public class GUI_Interface {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Stock");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		MyGraphPanel pnl = new MyGraphPanel();
		pnl.setBounds(0,0,300,400);
		frame.getContentPane().add(pnl);
		frame.setSize(300,400);
		
		

	}

}
