/* Rental.java - 
 * 
 * Author : JiHye Chun
 * Module : Module 2
 * Project : Chapter8/project #3
 * Problem Statement : 
 * Algorithm :
 */
package cs112hw2project3;

// Declare private variables to 
// store the movie rental business 
// informaiton.
public class Rental 
{
	private Movie movieRented;
	private int customerId;
	private int daysLateMovie;
	
	// Create a constructor for Rental class.
	public Rental(Movie rentedMovie, int usedId, int newDaysLate)
	{
		movieRented = rentedMovie;
		customerId = usedId;
		daysLateMovie = newDaysLate;
	}
	
	// Use accessor, mutator method for 
	// rented movie.
	public void setMovieRented(Movie rentedMovie)
	{
		movieRented = rentedMovie;
	}	
	public Movie getMovieRented()
	{
		return movieRented;
	}
	
	// Use accessor, mutator method for 
	// customer's ID information.
	public void setCustomerId(int usedId)
	{
		customerId = usedId;
	}
	public int getCustomerId(int usedId)
	{
		return customerId;
	}
	
	// Use accessor, mutator methods
	// for number of days late each movie.
	public void setDaysLateMovie(int newDaysLate)
	{
		daysLateMovie = newDaysLate;
	}
	public int getDaysLateMovie()
	{
		return daysLateMovie;
	}
	
	// Create a method that calculates
	// the outstanding late fee.
	public double getLateFee()
	{
		return movieRented.calcLateFee(daysLateMovie);
	}

	
}
