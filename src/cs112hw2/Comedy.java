/* Comedy.java - - This class is derived from 'Movie' class that stores
 * information of movie type 'Comedy'.
 * 
 * Author :	JiHye Chun
 * Module : Module2
 * Project : Chapter8 / Problem #2
 * Description : The class has the method that specifically
 *  calculates the late fee of the movie type Comedy.
 */
package cs112hw2;

public class Comedy extends Movie
{
	public Comedy(String rating, int idNumber,
						String movieTitle)
	{
		super(rating, idNumber, movieTitle);
	}
	
	public int calcLateFee(int numDayLate)
	{
		return (2.5)*numDayLate;
	}
	
}