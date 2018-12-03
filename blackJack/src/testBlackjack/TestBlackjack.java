package testBlackjack;

import static org.junit.Assert.*;

import org.junit.Test;

import blackJack.BlackJack;

public class TestBlackjack {

	@Test
	public void testBlakjack1() {
		BlackJack test = new BlackJack();
		assertEquals("Works when both numbers are bigger than 21", "The player has chosen: 22 The dealer has chosen: 22 The winning number is 0", BlackJack.blackJack(22, 22));
	}
	
	@Test
	public void testBlackjack2() {
		assertEquals("Returns biggest number", "21", BlackJack.blackJack(21,5));
	}
	
	
}


