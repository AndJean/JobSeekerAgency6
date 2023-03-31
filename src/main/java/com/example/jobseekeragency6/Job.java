package com.example.jobseekeragency6;
/** Class used to record the details of a tenant
 *  @author Charatan and Kans
 *  @version 6th April 2018
 */
public class Job
{
	private String name;
	private int room;
	private PaymentList payments;
	public static final int MAX = 12;
	
  /** Constructor initialises the name and room number of the tenant
	*  and sets the payments made to the empty list
  	*  @param  nameIn: name of tenant
  	*  @param  roomIn: room number of tenant
	*/
	public Job(String nameIn, int roomIn)
	{
            name = nameIn;
            room = roomIn;
            payments = new PaymentList(MAX);
	}
	
  /** Records a payment for the tenant 
   *  @param candidateIn: payment made by tenant
   */
	public void makePayment(Candidate candidateIn)
	{
            payments.addPayment(candidateIn); // call PaymentList method
	}
        
  /** Reads the name of the tenant
   *  @return Returns the name of the tenant
   */
	public String getName()
	{
            return name;
	}
	
  /** Reads the room of the tenant 
   *  @return Returns the room of the tenant
   */
	public int getRoom()
	{
            return room;
	}
	
  /** Reads the payments of the tenant 
   *  @return Returns the payments made by the tenant
   */
	public PaymentList getPayments()
	{
            return payments;
	}
        
   @Override
	public String toString()
   {
            return name+", "+room +", "+payments;
   }
}
