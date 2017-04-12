import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;

public class Week12B {
	
	public static double priceTickerLive(String ticker) throws Exception{
		URL url = new URL("http://finance.yahoo.com/quote/" + ticker);
		String html="";
		
		Scanner scan = new Scanner(url.openStream());
		
		while(scan.hasNext())
			
			html+=scan.nextLine();
			Matcher m = Pattern.compile("reactid=\"259\"?>\\d*\\.?\\d{0,2}</span>").matcher(html);
			m.find();			
			Matcher m1 = Pattern.compile("\\d+\\.\\d{0,2}").matcher(m.group());
			m1.find();
			return Double.parseDouble(m1.group());
	}
	
	public static void main(String[] args) throws Exception{
			System.out.println(priceTickerLive("AAPL"));
			
		}
		
		
		
	

}
