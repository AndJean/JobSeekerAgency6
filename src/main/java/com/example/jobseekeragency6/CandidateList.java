package com.example.jobseekeragency6;
import java.util.ArrayList;

/** Collection class to hold a list of Payment objects
 *  @author Charatan and Kans
 *  @version 4th April 2018
 */
public class CandidateList
{
   // attributes
   private ArrayList<Candidate> cList;


	public CandidateList(int maxIn)
	{  
            cList = new ArrayList<>();

	}
	
   /** Checks if the payment list is full
    *  @return Returns true if the list is full and false otherwise 
    */	
	public boolean isFull()
	{
            return cList.size()== MAX;
	}
        
   /** Gets the total number of payments 
    *  @return Returns the total number of payments currently in the list 
    */
    public int getTotal()
	{       
            return cList.size();
	}        
       	    
   /** Adds a new payment to the end of the list
	 *  @param  cIn: The payment to add
	 *  @return Returns true if the object was added successfully and false otherwise
	 */
    public boolean addCandidate(Candidate cIn)
	{
		if(!isFull())
		{
              cList.add(cIn);
              return true;
		}
		else
		{
              return false;
		}
	}      
     
   /** Reads the payment at the given position in the list
	 *  @param     positionIn: The logical position of the payment in the list
	 *  @return    Returns the payment at the given logical position in the list
	 *             or null if no payment at that logical position
	 */
    public Candidate getCandidate(int positionIn)
	{   
    	//check for valid logical position
       if (positionIn <1 || positionIn > getTotal())
       {
				// no object found at given position
				return null;
       }
       else
       {
				// take one off logical position to get ArrayList position
			   return cList.get(positionIn - 1);
       }
	}        
	
	/** Calculates the total payments made by the tenant 
    *  @return  Returns the total value of payments recorded 
    */
//	public double calculateTotalPaid()
//	{
//       double totalPaid = 0; // initialize totalPaid
//       // loop through all payments
//       for (Candidate c: cList)
//       {
//       		// add current payment to running total
//			 	totalPaid = totalPaid + c.getCandidateId();
//       }
//       return totalPaid;
//	}
                   
   @Override
	public String toString()
   {
            return cList.toString();
   }
}

