package Game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MainClass {
	
	String type[] = {"clubs", "diamonds", "hearts", "spades"};            // 0-3
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",   // 0-12
						"Q", "K", "A"};
	
<<<<<<< HEAD
	static int turn=0, p1money=1000, p2money=1000, p3money=1000, p4money=1000, p5money=1000, open=0, wp=0, cr=0;
	static ArrayList PlayersLeft = new ArrayList();
	static int[] money = {1000,1000,1000,1000,1000};
	static int[] moneybet = {0,0,0,0,0};
	static boolean rdy = false, fold = false;
	
	
	
=======
	static int turn, p1money, p2money, p3money, p4money, p5money, potmoney, betmoney;
	static ArrayList PlayersLeft = new ArrayList();
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
	
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
	
	
	public static void CompTurn() {
		Random r = new Random();
		cr =r.nextInt(5);
		if (cr == 0) Check();
		if (cr == 1) Bet();
		if (cr == 2) Raise();
		if (cr == 3) AllIn();
		if (cr == 4) Call();
		if (cr == 5) Fold();
	}
	
	public void SetPlayers() {
		PlayersLeft.clear();
		PlayersLeft.add(1);
	    PlayersLeft.add(2);
        PlayersLeft.add(3);
        PlayersLeft.add(4);
        PlayersLeft.add(5);
	}
	
	public static Component[] GameMenu() {
		
		ImagePanel panel = new ImagePanel(new ImageIcon("C:/Stuff/Programming/stuff/poker-tp/menu-background.png").getImage());
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
	    frame.add(panel);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    
	    play.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e){
	         frame.dispose();
	         GameWindow();
	        }
	       });

	       
	       options.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e){
	         JFrame frame = new JFrame("Options");
	         
	         JLabel cards = new JLabel("Cards:52");
	         cards.setVisible(true);
	         cards.setBorder(null);   
	         cards.setBounds(0, 0, 100, 50);
	         
	         JLabel players = new JLabel("Players:5");
	         players.setVisible(true);
	         players.setBorder(null);   
	         players.setBounds(0, 0, 100, 100);      
	         
	         
	         JLabel money = new JLabel("Money:1000");
	         money.setVisible(true);
	         money.setBorder(null);   
	         money.setBounds(0, 0, 100, 150);
	         
	         JLabel minbet = new JLabel("Minimal Bet:5");
	         minbet.setVisible(true);
	         minbet.setBorder(null);   
	         minbet.setBounds(0, 0,  100, 200);
	         
	         frame.setSize(250,200);
	         frame.add(cards);
	         frame.add(minbet);
	         frame.add(players);
	         frame.add(money);       
	         
	         frame.setResizable(true);
	         frame.setVisible(true);
	         frame.setLocationRelativeTo(null);
	        }
	       });
	       
	       
	       credits.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e){
	         JFrame frame = new JFrame("Credits");
	         JLabel cr = new JLabel("Game made by Chris Berov and Alexander Simonov");
	         cr.setVisible(true);
	         cr.setBorder(null);
	         
	         frame.add(cr);
	         frame.setSize(300,100);
	         frame.setResizable(false);
	         frame.setVisible(true);
	         frame.setLocationRelativeTo(null);
	             
	        }
	       });
	       
	       
	       
	       exit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e){
	         frame.dispose();       
	        }
	       });
	        
	       return frame.getComponents();
	}
	
	public static void Check() {
<<<<<<< HEAD
		rdy=true;
		turn++;
		if (turn==5 && rdy == true) { 
			open++;
			rdy=false;
		}  
		
		if (turn==5) turn = 0;
		/*if (open == 1) Pot();
		if (open == 2) Turn();
		if (open == 3) River();
		if (open == 4) { money[turn] += wp;  open = 0; rdy = false; turn = 0; wp=0; NewDeal();  */
		System.out.println(open);
		
	}
	public static void Call() {
		rdy=true;
		turn++;
		moneybet[turn] = moneybet[turn-1];
		money[turn] = money[turn] - moneybet [turn];
		wp += moneybet[turn];
		if (turn==PlayersLeft.size() && rdy == true) { 
			open++;
			rdy=false;
		}
		if (turn==PlayersLeft.size()) turn = 0;
		/*if (open == 1) Pot();
		if (open == 2) Turn();
		if (open == 3) River();
		if (open == 4) { money[turn] += wp;  open = 0; rdy = false; turn = 0; wp=0; NewDeal();  */
		 
	}
	public static void Bet() {
		rdy=false;
		moneybet[turn] = 50;  
		money[turn] -= moneybet[turn];
		wp += moneybet[turn];
		turn++;
		if (turn==PlayersLeft.size()) turn = 0;
		
	}
	public static void Raise() {
		rdy=false;
		moneybet[turn] += moneybet[turn-1];
		money[turn] -= moneybet[turn];
		wp += moneybet[turn];
		turn++;
		if (turn==PlayersLeft.size()) turn = 0;
		
	}
	public static void AllIn() {
		rdy=false;
		moneybet[turn] = money[turn];
		money[turn] = 0;
		wp += moneybet[turn];
		turn++;
		if (turn==PlayersLeft.size()) turn = 0;
		
	}
	public static void Fold() {
		fold=true;
		rdy=true;
		turn++;
		if (turn==PlayersLeft.size() && rdy == true) { 
			open++;
			rdy=false;
		}
		if (turn==PlayersLeft.size()) turn = 0;
		/*if (open == 1) Pot();
		if (open == 2) Turn();
		if (open == 3) River();
		if (open == 4) { money[turn] += wp;  open = 0; rdy = false; turn = 0; wp=0; NewDeal();  */
		
=======
		 turn++;
	}
	public static void Call() {
		 turn++;
	}
	public static void Bet() {
		 turn++;
	}
	public static void Raise() {
		 turn++;
	}
	public static void AllIn() {
		 turn++;
	}
	public static void Fold() {
		 turn++;
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
	}
	
	
public static void GameWindow() {
	
		JFrame frame = new JFrame("Poker");
		
		final JTextField bett = new JTextField("0");
	    bett.setBounds(850, 450, 65, 20);
	    bett.setVisible(true);	    
	    
	    final JTextField raiset = new JTextField("0");
	    raiset.setBounds(850, 400, 65, 20);
	    raiset.setVisible(true);
	     
	    final JTextField dealert = new JTextField("Dealer text in here...");
	    dealert.setBounds(850,50,150,200);
	    dealert.setVisible(true);
	    dealert.setFocusable(false);
	    
<<<<<<< HEAD
		final JButton check = new JButton("CHECK");
=======
		JButton check = new JButton("CHECK");
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
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
	    
<<<<<<< HEAD
	    JTextField p1moneyl = new JTextField();
	    p1moneyl.setBounds(385, 430, 40, 20);
	    p1moneyl.setVisible(true);
	    p1moneyl.setFocusable(false);
	    p1moneyl.setText(Integer.toString(money[0]));
	    
	    JTextField p2moneyl = new JTextField();
	    p2moneyl.setBounds(100, 400, 40, 20);
	    p2moneyl.setVisible(true);
	    p2moneyl.setFocusable(false);
	    p2moneyl.setText(Integer.toString(money[1]));
	    
	    JTextField p3moneyl = new JTextField();
	    p3moneyl.setBounds(100, 250, 40, 20);
	    p3moneyl.setVisible(true);
	    p3moneyl.setFocusable(false);
	    p3moneyl.setText(Integer.toString(money[2]));
	    
	    JTextField p4moneyl = new JTextField();
	    p4moneyl.setBounds(650, 250, 40, 20);
	    p4moneyl.setVisible(true);
	    p4moneyl.setFocusable(false);
	    p4moneyl.setText(Integer.toString(money[3]));
	    
	    JTextField p5moneyl = new JTextField();
	    p5moneyl.setBounds(650, 400, 40, 20);
	    p5moneyl.setVisible(true);
	    p5moneyl.setFocusable(false);
	    p5moneyl.setText(Integer.toString(money[4]));
	    
=======
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
	    Board board = new Board();
	    board.setLayout(null);
	    frame.setSize(1030, 615);
	    board.setVisible(true);
	    
		board.add(allin);
	    board.add(call);
	    board.add(fold);
	    board.add(raise);
	    board.add(bet);
	    board.add(check);
		board.add(bett);
		board.add(raiset);
		board.add(dealert);
<<<<<<< HEAD
		board.add(p1moneyl);
		board.add(p2moneyl);
		board.add(p3moneyl);
		board.add(p4moneyl);
		board.add(p5moneyl);
=======
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
		frame.add(board);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
<<<<<<< HEAD
	    
	   
=======
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
	    while(PlayersLeft.size()>1) {
	    	
	    	if(p1money<5) {
	    		PlayersLeft.remove(1);
	    	}
	    	
	    	if(p2money<5) {
	    		PlayersLeft.remove(2);
	    	}
	    	
	    	if(p3money<5) {
	    		PlayersLeft.remove(3);
	    	}
	    	
	    	if(p4money<5) {
	    		PlayersLeft.remove(4);
	    	}
	    	
	    	if(p5money<5) {
	    		PlayersLeft.remove(5);
	    	}
	    	
		}
	    
	    check.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e){
	    	  Check();
<<<<<<< HEAD
	    	 
=======
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
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
<<<<<<< HEAD
	    	   
=======
>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
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
	    
	    	bett.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e){
	    			String betting;
	    			betting = bett.getText();
	    			
	    		}
	    	});
	    	
	    	raiset.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					String raising;
					raising = raiset.getText();
					
				}
			});
	    	
	    	dealert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String dealerr = "I am the dealer!";
					dealert.setText(dealerr);
				}
			});
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
<<<<<<< HEAD
	}
=======
	}

		  

>>>>>>> 8539755c8cb2057be61e2fa26e94d97298a887bd
