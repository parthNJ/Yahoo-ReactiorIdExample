import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MyGraphPanel extends JPanel {
	
	
	ArrayList<Integer> stockHst = new ArrayList<>();
	
	int x=0;
	int y=0;
	
	int x0=0,y0=0;

	public MyGraphPanel(){
		
		setBackground(Color.yellow);
		
		Timer t = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					stockHst.add((int)(Week12B.priceTickerLive("AAPL")
							+	Math.random()*5)
					);
						
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				repaint();
			}
		});
		t.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		x=0;
		for(int y: stockHst){
			x+=5;
		g.drawLine(x0, y0, x, y);
		x0=x;
		y0=y;
		
		
		}
	
	}
}
