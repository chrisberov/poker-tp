package Game;

import static org.junit.Assert.*;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import org.junit.Test;



public class BoardTest {	
	
	@Test
	public void Player1CardsTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.Player1Cards();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
	}
	
	@Test
	public void Player2CardsTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.Player2Cards();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
	}
	
	@Test
	public void Player3CardsTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.Player3Cards();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
	}
	
	@Test
	public void Player4CardsTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.Player4Cards();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
	}
	
	@Test
	public void Player5CardsTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.Player5Cards();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
	}
	
	@Test
	public void RandomPotTest() {
		Board board = new Board();
		Image[] image;
		board.RefreshDeck();
		image = board.RandomPot();
		assertEquals(image[0], image[1]);
		assertEquals(image[2], image[3]);
		assertEquals(image[4], image[5]);
		assertEquals(image[6], image[6]);
		assertEquals(image[8], image[9]);
	}
	
	@Test
	public void RefreshDeckTest() {
		Board board = new Board();
		boolean isEmpty = board.RefreshDeck();
		assertFalse(isEmpty);
	}
}

