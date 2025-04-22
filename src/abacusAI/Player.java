package abacusAI;


public class Player {
private int score;
// getter for score
public int getScore() {
return score;}

// setter for score
public void setScore(int score) {
this.score =score;}

@Override
public String toString()
{
	return "Player [score=" + score + "]";
}



}