package com.example.jobseekeragency6;
// This class is used to store details of a single payment in a hostel

public class Candidate
{
	private String CandidateSurname;
	private double CandidateId;
	
	public Candidate(String CandidateSurnameIn, double CandidateIdIn)
	{
		CandidateSurname = CandidateSurnameIn;
		CandidateId= CandidateIdIn;
	}
	
	public String getCandidateSurname()
	{
            return CandidateSurname;
	}
	
	public double getCandidateId()
	{
            return CandidateId;
	}
        
   @Override
	public String toString()
   {
            return "("  + CandidateSurname + ", " + CandidateId  + ")";
   }

}

