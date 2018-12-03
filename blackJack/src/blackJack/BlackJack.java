package blackJack;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	
public static void main(String[] args) {
		
	
		System.out.println("The player has chosen: ");
		Random player = new Random();
		int a = player.nextInt(22)+1;
		System.out.println(a);
		
		
		System.out.println("The dealer has chosen: ");
		Random dealer = new Random();
		int b = dealer.nextInt(22)+1;
		System.out.println(b);
		
		System.out.println("The winning number is: ");
		System.out.println(blackJack(a,b));
		
	
	}
	
	
	public static int blackJack( int dealer, int player ) {
		if (dealer > 21 && player > 21) {
			return 0;
		}
		
		else if (dealer > 21) {
			return player;
		}
		
		else if (player > 21) {
			return dealer;
		}
				
		else {
			return Math.max(dealer, player);
		}
	
		
		
	}
}
