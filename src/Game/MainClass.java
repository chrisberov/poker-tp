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
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class MainClass {
	
	String type[] = {"clubs", "diamonds", "hearts", "spades"};            // 0-3
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",   // 0-12
						"Q", "K", "A"};
	
	 
	
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
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/poker-tp/poker-table.png").getImage());
		
	
		JButton check = new JButton("CHECK");
	    check.setBounds(850, 550, 65, 20);
	    check.setVisible(true);
	    check.setBorder(null);
	    
	    JButton bet = new JButton("BET");
	    bet.setBounds(925, 450, 65, 20);
	    bet.setVisible(true);
	    bet.setBorder(null);
	    
	    JButton raise = new JButton("RAISE");
	    raise.setBounds(925, 400, 65, 20);
	    raise.setVisible(true);
	    raise.setBorder(null);
	    
	    JButton fold = new JButton("FOLD");
	    fold.setBounds(925, 550, 65, 20);
	    fold.setVisible(true);
	    fold.setBorder(null);
	    
	    JButton call = new JButton("CALL");
	    call.setBounds(850, 500, 140, 20);
	    call.setVisible(true);
	    call.setBorder(null);
	    
	    JButton allin = new JButton("ALL IN");
	    allin.setBounds(850, 350, 140, 20);
	    allin.setVisible(true);
	    allin.setBorder(null);
	 	
	    
		frame.setSize(1030, 615);
	    frame.getContentPane();
	    frame.add(allin);
	    frame.add(call);
	    frame.add(fold);
	    frame.add(raise);
	    frame.add(bet);
		frame.add(check);
		frame.add(panel);
		frame.add(new Board());
		
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	


	check.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		Check();
	}	
});

    call.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		Call();
	}	
});

bet.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		Bet();
	}	
});

raise.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		Raise();
	}	
});

allin.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		AllIn();
	}	
});

fold.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		Fold();
	}	
}); 

}


public static void Check() {
	
}

public static void Call() {
	
}

public static void Bet() {
	
}
public static void Raise() {
	
}
public static void AllIn() {
	
}
public static void Fold() {
	
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
		  

