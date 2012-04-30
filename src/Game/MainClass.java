package Game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainClass {
	
	String type[] = {"clubs", "diamonds", "hearts", "spades"};            // 0-3
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",   // 0-12
						"Q", "K", "A"};
	
	static String deck[] = {"C2", "D2", "H2", "S2", "C3", "D3", "H3", "S3", "C4", "D4", "H4", "S4",
							"C5", "D5", "H5", "S5", "C6", "D6", "H6", "S6", "C7", "D7", "H7", "S7",
							"C8", "D8", "H8", "S8", "C9", "D9", "H9", "S9", "C10", "D10", "H10", "S10",
							"CJ", "DJ", "HJ", "SJ", "CQ", "DQ", "HQ", "SQ", "CK", "DK", "HK", "SK",
							"CA", "DA", "HA", "SA"}; // 0-51
	
	public static void main(String[] args) {		
	/*	deck[0] = "C2";	    deck[1] = "D2";    deck[2] = "H2";    deck[3] = "S2";
		deck[4] = "C3";	    deck[5] = "D3";    deck[6] = "H3";    deck[7] = "S3";
		deck[8] = "C4";	    deck[9] = "D4";    deck[10] = "H4";   deck[11] = "S4";
		deck[12] = "C5";	deck[13] = "D5";   deck[14] = "H5";   deck[15] = "S5";
		deck[16] = "C6";	deck[17] = "D6";   deck[18] = "H6";   deck[19] = "S6";
		deck[20] = "C7";	deck[21] = "D7";   deck[22] = "H7";   deck[23] = "S7";
		deck[24] = "C8";	deck[25] = "D8";   deck[26] = "H8";   deck[27] = "S8";
		deck[28] = "C9";	deck[29] = "D9";   deck[30] = "H9";   deck[31] = "S9";
		deck[32] = "C10";	deck[33] = "D10";  deck[34] = "H10"; deck[35] = "S10";
		deck[36] = "CJ";	deck[37] = "DJ";   deck[38] = "HJ";   deck[39] = "SJ";
		deck[40] = "CQ";	deck[41] = "DQ";   deck[42] = "HQ";   deck[43] = "SQ";
		deck[44] = "CK";	deck[45] = "DK";   deck[46] = "HK";   deck[47] = "SK";
		deck[48] = "CA";	deck[49] = "DA";   deck[50] = "HA";   deck[51] = "SA";
		
		*/
		
		GameMenu();
		
	}
	
	public static void GameMenu() {
		
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/poker-tp/menu-background.png").getImage());
	    final JFrame frame = new JFrame("Poker");  
	    
	    JButton play = new JButton("PLAY");
	    play.setBounds(440, 280, 139, 21);
	    play.setVisible(true);
	    play.setBorder(null);
	    
	    JButton options = new JButton("OPTIONS");
	    options.setBounds(440, 320, 139, 21);
	    options.setVisible(true);
	    options.setBorder(null);
	    
	    JButton credits = new JButton("CREDITS");
	    credits.setBounds(440, 360, 139, 21);
	    credits.setVisible(true);
	    credits.setBorder(null);
	    
	    JButton exit = new JButton("EXIT");
	    exit.setBounds(440, 400, 139, 21);
	    exit.setVisible(true);
	    exit.setBorder(null);
	    
	    
	    frame.add(play);
	    frame.add(options);
	    frame.add(credits);
	    frame.add(exit);
	    frame.setSize(1030, 615);
	    frame.getContentPane().add(panel);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);

	    play.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e){
	    		frame.dispose();
	    		GameWindow();
	    	}
	    });
	        
	}
	
    
	
	public static void GameWindow() {
		JFrame frame = new JFrame("Poker");
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1030,615);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	}
	
	public void GetDeck() {
		  Image C2 = new ImageIcon("D:/poker-tp/2C.jpeg").getImage();
		  Image D2 = new ImageIcon("D:/poker-tp/2D.jpeg").getImage();
		  Image H2 = new ImageIcon("D:/poker-tp/2H.jpeg").getImage();
		  Image S2 = new ImageIcon("D:/poker-tp/2S.jpeg").getImage();
		  
		  Image C3 = new ImageIcon("D:/poker-tp/3C.jpeg").getImage();
		  Image D3 = new ImageIcon("D:/poker-tp/3D.jpeg").getImage();
		  Image H3 = new ImageIcon("D:/poker-tp/3H.jpeg").getImage();
		  Image S3 = new ImageIcon("D:/poker-tp/3S.jpeg").getImage();
		  
		  Image C4 = new ImageIcon("D:/poker-tp/4C.jpeg").getImage();
		  Image D4 = new ImageIcon("D:/poker-tp/4D.jpeg").getImage();
		  Image H4 = new ImageIcon("D:/poker-tp/4H.jpeg").getImage();
		  Image S4 = new ImageIcon("D:/poker-tp/4S.jpeg").getImage();
		  
		  Image C5 = new ImageIcon("D:/poker-tp/5C.jpeg").getImage();
		  Image D5 = new ImageIcon("D:/poker-tp/5D.jpeg").getImage();
		  Image H5 = new ImageIcon("D:/poker-tp/5H.jpeg").getImage();
		  Image S5 = new ImageIcon("D:/poker-tp/5S.jpeg").getImage();
		  
		  Image C6 = new ImageIcon("D:/poker-tp/6C.jpeg").getImage();
		  Image D6 = new ImageIcon("D:/poker-tp/6D.jpeg").getImage();
		  Image H6 = new ImageIcon("D:/poker-tp/6H.jpeg").getImage();
		  Image S6 = new ImageIcon("D:/poker-tp/6S.jpeg").getImage();
		  
		  Image C7 = new ImageIcon("D:/poker-tp/7C.jpeg").getImage();
		  Image D7 = new ImageIcon("D:/poker-tp/7D.jpeg").getImage();
		  Image H7 = new ImageIcon("D:/poker-tp/7H.jpeg").getImage();
		  Image S7 = new ImageIcon("D:/poker-tp/7S.jpeg").getImage();
		  
		  Image C8 = new ImageIcon("D:/poker-tp/8C.jpeg").getImage();
		  Image D8 = new ImageIcon("D:/poker-tp/8D.jpeg").getImage();
		  Image H8 = new ImageIcon("D:/poker-tp/8H.jpeg").getImage();
		  Image S8 = new ImageIcon("D:/poker-tp/8S.jpeg").getImage();
		  
		  Image C9 = new ImageIcon("D:/poker-tp/9C.jpeg").getImage();
		  Image D9 = new ImageIcon("D:/poker-tp/9D.jpeg").getImage();
		  Image H9 = new ImageIcon("D:/poker-tp/9H.jpeg").getImage();
		  Image S9 = new ImageIcon("D:/poker-tp/9S.jpeg").getImage();
		  
		  Image C10 = new ImageIcon("D:/poker-tp/10C.jpeg").getImage();
		  Image D10 = new ImageIcon("D:/poker-tp/10D.jpeg").getImage();
		  Image H10 = new ImageIcon("D:/poker-tp/10H.jpeg").getImage();
		  Image S10 = new ImageIcon("D:/poker-tp/10S.jpeg").getImage();
		  
		  Image CJ = new ImageIcon("D:/poker-tp/JC.jpeg").getImage();
		  Image DJ = new ImageIcon("D:/poker-tp/JD.jpeg").getImage();
		  Image HJ = new ImageIcon("D:/poker-tp/JH.jpeg").getImage();
		  Image SJ = new ImageIcon("D:/poker-tp/JS.jpeg").getImage();
		  
		  Image CQ = new ImageIcon("D:/poker-tp/QC.jpeg").getImage();
		  Image DQ = new ImageIcon("D:/poker-tp/QD.jpeg").getImage();
		  Image HQ = new ImageIcon("D:/poker-tp/QH.jpeg").getImage();
		  Image SQ = new ImageIcon("D:/poker-tp/QS.jpeg").getImage();
		  
		  Image CK = new ImageIcon("D:/poker-tp/KC.jpeg").getImage();
		  Image DK = new ImageIcon("D:/poker-tp/KD.jpeg").getImage();
		  Image HK = new ImageIcon("D:/poker-tp/KH.jpeg").getImage();
		  Image SK = new ImageIcon("D:/poker-tp/KS.jpeg").getImage();
		  
		  Image CA = new ImageIcon("D:/poker-tp/AC.jpeg").getImage();
		  Image DA = new ImageIcon("D:/poker-tp/AD.jpeg").getImage();
		  Image HA = new ImageIcon("D:/poker-tp/AH.jpeg").getImage();
		  Image SA = new ImageIcon("D:/poker-tp/AS.jpeg").getImage();
		  
		  Image backside = new ImageIcon("D:/poker-tp/backside.png").getImage();
		  		
	  }
	  
	  public void RandomizeCard1() {
		  Random generator = new Random();
		  int randomizedcard1 = generator.nextInt(51);
	  }
	  
	  public void RandomizeCard2() {
		  Random generator = new Random();
		  int randomizedcard2 = generator.nextInt(51); 
		}
	
}
	
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }
		  
		  public void paintComponent(Graphics g) {
			  	
			    g.drawImage(img, 0, 0, null);
		  }
	}
		  

