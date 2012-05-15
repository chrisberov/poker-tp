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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	Image img, p1card1, p1card2, p2card1, p2card2, p3card1, p3card2, p4card1, p4card2, p5card1, p5card2,
			pot1, pot2, pot3, turn, river, hidden;
	Timer time;
	static String deck[] = {"C2", "D2", "H2", "S2", "C3", "D3", "H3", "S3", "C4", "D4", "H4", "S4",
		"C5", "D5", "H5", "S5", "C6", "D6", "H6", "S6", "C7", "D7", "H7", "S7",
		"C8", "D8", "H8", "S8", "C9", "D9", "H9", "S9", "C10", "D10", "H10", "S10",
		"CJ", "DJ", "HJ", "SJ", "CQ", "DQ", "HQ", "SQ", "CK", "DK", "HK", "SK",
		"CA", "DA", "HA", "SA"};

	ArrayList cards = new ArrayList();
	
	public Board() {
		  setFocusable(true);
		  ImageIcon i = new ImageIcon("C:/Stuff/Programming/stuff/poker-tp/poker-table.png");
		  
		  Image backside = new ImageIcon("C:/Stuff/Programming/stuff/poker-tp/backside.png").getImage();		  
		  hidden = backside;
		  RefreshDeck();
		  Player1Cards();
		  Player2Cards();
		  Player3Cards();
		  Player4Cards();
		  Player5Cards();
		  RandomPot();
		  RefreshDeck();
 
		    
		    img = i.getImage();
		  
		}
	
	public void Player1Cards() {
		  
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  p1card1 = aa.getImage();
		  
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  p1card2 = bb.getImage();
		  cards.remove(rr);
		  
	}
	
	public void Player2Cards() {
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  p2card1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  p2card2 = bb.getImage();
		  cards.remove(rr);
	}
	
	public void Player3Cards() {
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  p3card1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  p3card2 = bb.getImage();
		  cards.remove(rr);
	}
	
	public void Player4Cards() {
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  p4card1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  p4card2 = bb.getImage();
		  cards.remove(rr);
	}
	
	public void Player5Cards() {
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  p5card1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  p5card2 = bb.getImage();
		  cards.remove(rr);
	}
	
	public void RandomPot() {
		  Random rand = new Random();
		  int r = rand.nextInt(cards.size());
		  ImageIcon aa = new ImageIcon(cards.get(r).toString());
		  pot1 = aa.getImage();
		  cards.remove(r);
		  int rr = rand.nextInt(cards.size());
		  ImageIcon bb = new ImageIcon(cards.get(rr).toString());
		  pot2 = bb.getImage();
		  cards.remove(rr);
		  int rrr = rand.nextInt(cards.size());
		  ImageIcon cc = new ImageIcon(cards.get(rrr).toString());
		  pot3 = cc.getImage();
		  cards.remove(rrr);
		  int rrrr = rand.nextInt(cards.size());
		  ImageIcon dd = new ImageIcon(cards.get(rrrr).toString());
		  turn = dd.getImage();
		  cards.remove(rrrr);
		  int rrrrr = rand.nextInt(cards.size());
		  ImageIcon ee = new ImageIcon(cards.get(rrrrr).toString());
		  river = ee.getImage();
		  cards.remove(rrrrr);
	}
	
	public void RefreshDeck() {
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/2C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/2D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/2H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/2S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/3C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/3D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/3H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/3S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/4C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/4D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/4H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/4S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/5C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/5D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/5H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/5S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/6C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/6D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/6H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/6S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/7C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/7D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/7H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/7S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/8C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/8D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/8H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/8S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/9C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/9D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/9H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/9S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/10C.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/10D.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/10H.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/10S.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/JC.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/JD.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/JH.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/JS.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/QC.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/QD.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/QH.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/QS.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/KC.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/KD.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/KH.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/KS.png");
		  
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/AC.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/AD.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/AH.png");
		  cards.add("C:/Stuff/Programming/stuff/poker-tp/AS.png");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(p1card1,340,350,null);
		g2d.drawImage(p1card2,400,350,null);
		g2d.drawImage(hidden,  50,300,null);
		g2d.drawImage(hidden, 110,300,null);
		g2d.drawImage(hidden,  50,150,null);
		g2d.drawImage(hidden, 110,150,null);
		g2d.drawImage(hidden, 600,150,null);
		g2d.drawImage(hidden, 660,150,null);
		g2d.drawImage(hidden, 600,300,null);
		g2d.drawImage(hidden, 660,300,null);
		g2d.drawImage(pot1,   220,220,null);
		g2d.drawImage(pot2,   290,220,null);
		g2d.drawImage(pot3,   360,220,null);
		g2d.drawImage(turn,   430,220,null);
		g2d.drawImage(river,  500,220,null);
	}
	
	
}
