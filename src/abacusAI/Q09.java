package abacusAI;

public class Q09
{

	public static void main(String[] args)
	{
//		9. Getters and Setters
//		Problem:
//		Add a private field int score to a class Player and provide public getter and setter methods for it.
//
//		Targeted Concept:
//		Encapsulation – Using getters and setters to access private fields.
				
		Player player = new Player();
		player.setScore(10000000);
		System.out.println("Player's score: " + player.getScore());
	}

}
