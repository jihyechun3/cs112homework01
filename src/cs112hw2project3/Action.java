/* Action.java - This class is derived from 'Movie' class that stores
 * information of movie type 'Action'.
 * 
 * Author :	JiHye Chun
 * Module : Module2
 * Project : Chapter8 / Problem #3
 * Description : The class has the method that specifically
 *  calculates the late fee of the movie type Action.
 */

package cs112hw2project3;

public class Action extends Movie
{
	// Create constructor for Action class.
	public Action(String rating, int idNumber,
						String movieTitle)
	{
		super(rating, idNumber, movieTitle);
	}
	
	// Create method for calculating late fee.
	public int calcLateFee(int numDayLate)
	{
		return 3*numDayLate;
	}
}