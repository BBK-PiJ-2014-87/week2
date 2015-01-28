import java.util.Scanner;

public class PokerHands {
	public static void main(String[] args) {
		int i = 0;
		int card_rank = 0;
		String card = "";
		Scanner in = new Scanner(System.in);
		int card_suit = 0;
		String cardsArray = "";
		int card1 = 0;
		int card2 = 0;
		int card3 = 0;
		int card4 = 0;
		int card5 = 0;
		boolean check;
		
		//Input of 5 cards
		while (i < 5) {
			check = true;
			//Card rank input
			System.out.println("Please enter the card \n"
					+ "(1,2,3,4,5,6,7,8,9,10,11 for J, 12 for Q, 13 for K)");
			//For each rank add 100 to make same amount of digits
			card_rank = in.nextInt()+100;
			// check if card rank is valid
			if (card_rank > 113) {
				check = !check;
			}
			//If check is valid input card suit
			if (check) {
				System.out
						.println("Please enter suit of the card: \n1. for spades \n"
								+ "2.for hearts \n"
								+ "3. for diamonds \n"
								+ "4. for clubs");
				card_suit = in.nextInt();
			}

			// Create a card as string "1234"
			if (card_suit==1||card_suit==2||card_suit==3||card_suit==4) {
				card = Integer.toString(card_rank) + Integer.toString(card_suit);
			} else {
				check = !check;
			}
			
			
			//@TEST print for cardFinal
			System.out.println("@TEST:cardFinal = " + card);
			
			//Check if card is duplicated
			if (check) {
				if (cardsArray.contains(card)) {
					check = !check;
				}
			}
			//If all checks are passed - add card to string array
			if (check) {
				cardsArray = cardsArray + card;
				i++;
			}
			if (!check) {
				System.out.println("Please enter valid card!");
			}
			//@TEST print
			System.out.println("cardArray = " + cardsArray + " i = " + i);

		}
		
		// SORTING - convert cards to integers for sorting
		card1 = Integer.parseInt(cardsArray.substring(0, 4));
		card2 = Integer.parseInt(cardsArray.substring(4, 8));
		card3 = Integer.parseInt(cardsArray.substring(8, 12));
		card4 = Integer.parseInt(cardsArray.substring(12, 16));
		card5 = Integer.parseInt(cardsArray.substring(16, 20));

		System.out.println(card1 + " " + card2 + " " + card3 + " " + card4
				+ " " + card5);

		// SORT CARDS
		int temp = 0;
		cardsArray = "";
		while (card1 > card2 || card2 > card3 || card3 > card4 || card4 > card5) {
			if (card1 > card2) {
				temp = card1;
				card1 = card2;
				card2 = temp;
			}
			if (card2 > card3) {
				temp = card2;
				card2 = card3;
				card3 = temp;
			}
			if (card3 > card4) {
				temp = card3;
				card3 = card4;
				card4 = temp;
			}
			if (card4 > card5) {
				temp = card4;
				card4 = card5;
				card5 = temp;
			}
			System.out.println(card1 + " " + card2 + " " + card3 + " " + card4
					+ " " + card5);

		}
		cardsArray = (card1 + "" + card2 + "" + card3 + "" + card4 + "" + card5);
		System.out.println(cardsArray + " length is " + cardsArray.length());
		
		//POKER
		//while(){
			//cardRank1 = Integer.parseInt(cardsArray.substring(0, 3));
			
		//}

	}
	
}
