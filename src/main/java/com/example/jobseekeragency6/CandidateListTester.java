package com.example.jobseekeragency6;

public class CandidateListTester
{
  
    public static void main(String[] args)
    {
		char choice;
		int size;
		CandidateList list; // declare PaymentList object to test
	
		// get size of list
		System.out.print("Size of list? ");
		size = EasyScanner.nextInt();
		list = new CandidateList(size); // create object to test
		// menu
		do
		{
            // display options
            System.out.println();
            System.out.println("[1] ADD CANDIDATE");
            System.out.println("[2] DISPLAY CANDIDATES");
            System.out.println("[3] IS FULL");
            System.out.println("[4] GET CANDIDATE");
            System.out.println("[5] GET TOTAL CANDIDATES");
            System.out.println("[6] CALCULATE TOTAL PAID");
            System.out.println("[7] Quit");
            System.out.println();
            System.out.print("Enter a choice [1-7]: ");
            // get choice
            choice = EasyScanner.nextChar();
            System.out.println();
            // process choice
            switch(choice)
            {
                case '1': option1(list); break;
                case '2': option2(list); break;
                case '3': option3(list); break;
                case '4': option4(list); break;
                case '5': option5(list); break;
                case '6': option6(list); break;
                case '7': System.out.println("TESTING COMPLETE"); break;
                default: System.out.print("1-7 only");
            }
		} while (choice != '7');
    }
  
    // ADD
    static void option1(CandidateList listIn)
    {  
        // prompt for payment details
        System.out.print("Enter you Surname: ");
        String candidateSurname = EasyScanner.nextString();
        System.out.print("Enter you Id number: ");
        double candidateId = EasyScanner.nextDouble();
        // create new Payment object from input
        Candidate c = new Candidate(candidateSurname, candidateId);
        // attempt to add payment to list
        boolean ok = listIn.addPayment(c); // value of false sent back if unable to add
        if (!ok)// check if item was not added
        {
            System.out.println("ERROR: list full");
        }
    }

    // DISPLAY
    static void option2(CandidateList listIn)
    {  
        System.out.println("ITEMS ENTERED");
        System.out.println(listIn); // calls toString method of PaymentList
    }

    // IS FULL
    static void option3(CandidateList listIn)
    {  
        if (listIn.isFull())
        {
            System.out.println("list is full");
        }
        else
        {
            System.out.println("list is NOT full");
        }
    }  
  
    // GET Candidate
    static void option4(CandidateList listIn)
    {  
        // prompt for and receive payment number
        System.out.print("Enter payment number to retrieve: ");
        int num = EasyScanner.nextInt();
        // retrieve Payment object form list
        Candidate c = listIn.getCandidate(num); // returns null if invalid position
        if (c != null)// check if Payment retrieved
        {
            System.out.println(c); // calls toString method of Payment
        }
        else
        {
            System.out.println("INVALID PAYMENT NUMBER"); // invalid position error
        }   
    }

    // GET TOTAL
    static void option5(CandidateList listIn)
    {  
        System.out.print("TOTAL NUMBER OF PAYMENTS ENTERED: ");
        System.out.println(listIn.getTotal()); 
    }

    // GET TOTAL PAID
    static void option6(CandidateList listIn)
    {  
        System.out.print("TOTAL OF PAYMENTS MADE SO FAR: ");
        System.out.println(listIn.calculateTotalPaid()); 
    }
}
