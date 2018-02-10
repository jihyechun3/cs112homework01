/* Movie.java -  
 * 
 * Author : JiHye Chun
 * Module : Module 2
 * Project : Chapter8/project #3
 * Problem Statement : 
 * Algorithm :
 */
package cs112hw2project3;

// Declare private variables to store the value
// of Movie class's information. 
public abstract class Movie 
{
		private String rating;
		private int idNumber;
		private String movieTitle;
		private double numDayLate;
		
		// Create constructor for Movie class.
		public Movie(String newRating, int newIdNum,
				String newMovieTitle)
		{
			rating = newRating;
			idNumber = newIdNum;
			movieTitle = newMovieTitle;
			numDayLate = 0;
		}
		
		// Use mutator and accessor methods for movie
		// rating information.
		public void setRating(String newRating)
		{
			rating = newRating;
		}
		public String getRating()
		{
			return rating;
		}
		
		// Use mutator and accessor methods for 
		// customer's id number.
		public void setIdNumber(int newIdNumber)
		{
			idNumber = newIdNumber;
		}
		public int getIdNumber()
		{
			return idNumber;
		}
		
		// Use mutator and accessor methods for 
		// movie title info.
		public void setMovieTitle(String newMovieTitle)
		{
			movieTitle = newMovieTitle;
		}
		public String getMovieTitle()
		{
			return movieTitle;
		}
		
		// Create a method for setting a default 
		// late fee calcualtion.
		public int calcLateFee(int numDayLate)
		{
			return 2*numDayLate;
		}
		
		// Create a equals methods to compare 
		// and check two customer's id number.
		public boolean equals(Movie anoMovie)
		{
			if(anoMovie.getIdNumber() == idNumber)
			{
				return true;
			}
				return false;	
		}
		
		// Create a method to store and 
		// return the number of days late
		public double daysLateMovie() 
		{
			return numDayLate ;
		}
		
}

