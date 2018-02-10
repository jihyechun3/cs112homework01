/* MovieRentalMain.java - This program will use and output the method used from parent and drived 
 * classes.
 * 
 * Author :	JiHye Chun
 * Module : Module2
 * Project : Chapter8 / Problem #2
 * Problem Statement : 
 * Algorithm :
 */
package cs112hw2;

public class MovieRentalMain 
{
	public static void main(String[] args) 
	{
		Movie aMovie = new Action("PG-13",1234,"John Wick");
		Movie bMovie = new Comedy("PG-15",5678,"Pitch Perfect");
		Movie cMovie = new Drama("PG-16",9876,"Love Actually");
		
		System.out.println("Rating : " +aMovie.getRating() 
		+ ", ID : " + aMovie.getIdNumber() 
		+ ", Movie title : " + aMovie.getMovieTitle()
		);
		
		System.out.println("Rating : " + bMovie.getRating() 
		+ ", ID : " + bMovie.getIdNumber() 
		+ ", Movie title : " + bMovie.getMovieTitle()
		);
		
		System.out.println("Rating : " + cMovie.getRating() 
		+ ", ID : " + cMovie.getIdNumber() 
		+ ", Movie title : " + cMovie.getMovieTitle()
		);
		
	}

}
