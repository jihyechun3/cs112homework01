/* Movie.java - This is parent class that has all the methods 
 * 
 * Author : JiHye Chun
 * Module : Module 2
 * Project : Chapter8/project #2
 * Problem Statement : 
 * Algorithm :
 */
package cs112hw2;

public abstract class Movie 
{
	private String rating;
	private int idNumber;
	private String movieTitle;
	private int numDayLate;
	
	public Movie(String newRating, int newIdNum,
			String newMovieTitle)
	{
		rating = newRating;
		idNumber = newIdNum;
		movieTitle = newMovieTitle;
		
	}
	public void setRating(String newRating)
	{
		rating = newRating;
	}
	public String getRating()
	{
		return rating;
	}
	public void setIdNumber(int newIdNumber)
	{
		idNumber = newIdNumber;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public void setMovieTitle(String newMovieTitle)
	{
		movieTitle = newMovieTitle;
	}
	public String getMovieTitle()
	{
		return movieTitle;
	}
	
	public int calcLateFee()
	{
		return 2*numDayLate;
	}
	
	public boolean equals(Movie anoMovie)
	{
		if(anoMovie.getIdNumber() == idNumber)
		{
			return true;
		}
			return false;	
	}
	
	// use toString method
	
	
}
