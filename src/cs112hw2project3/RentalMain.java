/* RentalMain.java - 
 * 
 * Author : JiHye Chun
 * Module : Module 2
 * Project : Chapter8/project #3
 * Problem Statement : 
 * Algorithm :
 */
package cs112hw2project3;

public class RentalMain 
{
	public static double lateFeeOwed(Rental[] rentalList)
	{
		double totalLateFee = 0;
		
		for(int i = 0; i < rentalList.length ; i++)
		{
			totalLateFee += rentalList[i].getLateFee();
		}
	
		/*
		for(Rental rental : rentalList) {
			totalLafeFee += rental.getLateFee();
		}*/
		
		System.out.println(" Test : " + totalLateFee);
		return  totalLateFee;
		
	}
	
	public static void main(String[] args) 
	{
		Movie movieList[] = new Movie[6];
		
		movieList[0] = new Action("PG-13",1234,"John Wick");
		movieList[1] = new Comedy("PG-19",3432,"Home Alone");
		movieList[2] = new Drama("PG-10",3434,"Love Actually");
		movieList[3] = new Action("PG-3",5532,"Star Wars");
		movieList[4] = new Comedy("PG-8",1032,"Cafe Society");
		movieList[5] = new Drama("PG-13",5038,"Rome With Love");
		
		Rental rentalList[] = new Rental[4];
		
		rentalList[0] = new Rental(movieList[0],3454,3);
		rentalList[1] = new Rental(movieList[1],3242,2);
		rentalList[2] = new Rental(movieList[2],5984,0);
		rentalList[3] = new Rental(movieList[3],1923,4);	

		System.out.println(" Test : " + rentalList[1].getDaysLateMovie());

		String category1 = "Rental No.";
		String category2 = "Customer ID";
		String category3 = "Movie Title";
		String category4 = "Class";
		String category5 = "Movie ID";
		String category6 = "MPAA Rating";
		String category7 = "Late Days";
		String category8 = "Late Fees";
		
		System.out.printf("%1s %12s %15s %-10s %-9s %-13s %6s %8s", 
				category1,category2,category3,category4,category5,category6,
				category7,category8);	
		
		System.out.println(" Test : " + lateFeeOwed(rentalList));
		
	}
	

}
