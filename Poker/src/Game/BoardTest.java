package Game;

import static org.junit.Assert.*;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import org.junit.Test;



public class BoardTest {	
	
	@Test
	public void PlayerCardsTest() {
		Board board = new Board();
		board.RefreshDeck();
		board.Player1Cards();
		assertEquals();
	}
	
}

