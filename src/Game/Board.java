package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	Image img, card1, card2;
	Timer time;
	static String deck[] = {"C2", "D2", "H2", "S2", "C3", "D3", "H3", "S3", "C4", "D4", "H4", "S4",
		"C5", "D5", "H5", "S5", "C6", "D6", "H6", "S6", "C7", "D7", "H7", "S7",
		"C8", "D8", "H8", "S8", "C9", "D9", "H9", "S9", "C10", "D10", "H10", "S10",
		"CJ", "DJ", "HJ", "SJ", "CQ", "DQ", "HQ", "SQ", "CK", "DK", "HK", "SK",
		"CA", "DA", "HA", "SA"};

	ArrayList cards = new ArrayList();
	
	public Board() {
		  setFocusable(true);
		  ImageIcon i = new ImageIcon("D:/poker-tp/poker-table.png");
		  
		  ImageIcon backside = new ImageIcon("D:/poker-tp/backside.png");		  
		  
		  FillDeck();
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  card1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  card2 = bb.getImage();
		  cards.remove(rr);
		  FillDeck();
		img = i.getImage();
		
		time = new Timer(5, this);
		time.start();
		
		  
		
		  
	}
	
	public void FillDeck() {
		  cards.add("D:/poker-tp/2C.png");
		  cards.add("D:/poker-tp/2D.png");
		  cards.add("D:/poker-tp/2H.png");
		  cards.add("D:/poker-tp/2S.png");
		  
		  cards.add("D:/poker-tp/3C.png");
		  cards.add("D:/poker-tp/3D.png");
		  cards.add("D:/poker-tp/3H.png");
		  cards.add("D:/poker-tp/3S.png");
		  
		  cards.add("D:/poker-tp/4C.png");
		  cards.add("D:/poker-tp/4D.png");
		  cards.add("D:/poker-tp/4H.png");
		  cards.add("D:/poker-tp/4S.png");
		  
		  cards.add("D:/poker-tp/5C.png");
		  cards.add("D:/poker-tp/5D.png");
		  cards.add("D:/poker-tp/5H.png");
		  cards.add("D:/poker-tp/5S.png");
		  
		  cards.add("D:/poker-tp/6C.png");
		  cards.add("D:/poker-tp/6D.png");
		  cards.add("D:/poker-tp/6H.png");
		  cards.add("D:/poker-tp/6S.png");
		  
		  cards.add("D:/poker-tp/7C.png");
		  cards.add("D:/poker-tp/7D.png");
		  cards.add("D:/poker-tp/7H.png");
		  cards.add("D:/poker-tp/7S.png");
		  
		  cards.add("D:/poker-tp/8C.png");
		  cards.add("D:/poker-tp/8D.png");
		  cards.add("D:/poker-tp/8H.png");
		  cards.add("D:/poker-tp/8S.png");
		  
		  cards.add("D:/poker-tp/9C.png");
		  cards.add("D:/poker-tp/9D.png");
		  cards.add("D:/poker-tp/9H.png");
		  cards.add("D:/poker-tp/9S.png");
		  
		  cards.add("D:/poker-tp/10C.png");
		  cards.add("D:/poker-tp/10D.png");
		  cards.add("D:/poker-tp/10H.png");
		  cards.add("D:/poker-tp/10S.png");
		  
		  cards.add("D:/poker-tp/JC.png");
		  cards.add("D:/poker-tp/JD.png");
		  cards.add("D:/poker-tp/JH.png");
		  cards.add("D:/poker-tp/JS.png");
		  
		  cards.add("D:/poker-tp/QC.png");
		  cards.add("D:/poker-tp/QD.png");
		  cards.add("D:/poker-tp/QH.png");
		  cards.add("D:/poker-tp/QS.png");
		  
		  cards.add("D:/poker-tp/KC.png");
		  cards.add("D:/poker-tp/KD.png");
		  cards.add("D:/poker-tp/KH.png");
		  cards.add("D:/poker-tp/KS.png");
		  
		  cards.add("D:/poker-tp/AC.png");
		  cards.add("D:/poker-tp/AD.png");
		  cards.add("D:/poker-tp/AH.png");
		  cards.add("D:/poker-tp/AS.png");
	}
	
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(card1,340,350,null);
		g2d.drawImage(card2,400,350,null);
	}
	
	
	public Timer getTime() {
		return time;
	}
}
