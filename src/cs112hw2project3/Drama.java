/* Action.java - This class is derived from 'Movie' class that stores
 * information of movie type 'Drama'.
 * 
 * Author :	JiHye Chun
 * Module : Module2
 * Project : Chapter8 / Problem #3
 * Description : The class has the method that specifically
 *  calculates the late fee of the movie type Drama.
 */
package cs112hw2project3;

public class Drama extends Movie
{
	// Create constructor for Drama class
	public Drama(String rating, int idNumber,
						String movieTitle)
	{
		super(rating, idNumber, movieTitle);
	}
	
	// Create method for calculating late fee.
	public int calcLateFee(int numDayLate)
	{
		return 2*numDayLate;
	}
}